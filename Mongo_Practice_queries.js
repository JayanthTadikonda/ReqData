BASIC CMDS

show dbs

use db_Name

show collections


db.name.find()  #Lists all the documents in the collections.


QUERY DOCUMENTS

db.movies.find()

db.movies.find({writer:'Quentin Tarantino'})

db.movies.find({actors:'Brad Pitt'})

db.movies.find({franchise:'The Hobbit'})

db.movies.find({year: {$lt:2000}})

db.movies.find({ $or: [ {year: {$lt:2000}}, {year:{$gt:2010}} ] })


UPDATE DOCS

db.movies.update({title: 'The Hobbit: An Unexpected Journey'}, {$set:{synopsis: 'Testing update for them movie collections' }} )

db.movies.update({title: 'Pulp Fiction'}, {$set: {actors: 'Samuel L.Jackson'}})


TEXT SEARCH
AFTER INDEXING 
 
 db.movies.createIndex({'synopsis':'text'})

 db.movies.find({$text: {$search: 'Bilbo'}})
 
 db.movies.find({$text : {$search: 'Bilbo -Gandalf'}})  #Finds Bilbo contained Synopsis but not Gandalf.44
 
 
 DELETING DOCUMENTS
 
 db.movies.remove ({title: 'Avatar'})
 
 ====================================================================================================
 
 
 RELATIONAL QUERIES
 
 db.posts.findOne({title:'Borrows something'})._id  ## Gives object id of the doc.
 
 var a = db.posts.findOne({title:'Borrows something'})._id  ## Gives object id of the doc.
 
 db.comments.find({post: a})  ##finds all comments related .
 
 =========================================================================================
 
 
 A2
 
 
  db.persons.find({$and:[{state:'GA'},{city:'ATLANTA'}]})
 
  db.persons.aggregate([ {$match: {state:'GA', city:'ATLANTA'}} ])
  
  
  
  db.persons.aggregate([{$sort: {pop:1}}]) ##Sort by population
  
   db.persons.aggregate([
... {$sort: {pop:-1}},
... {$limit: 3}
... ])                    ##Limit to 3

db.persons.aggregate([ {$group: {_id: {city:'ATLANTA'}, AtlantaTotalPop: {$sum:1}}} ]) ##atlanta total pop

 db.persons.aggregate([{$group: {_id:'$state', Population:{$sum:1}}}]) ## population by state
 
 
  db.persons.aggregate([{$group: {_id:'$state', population:{$sum:1}}},{$sort: {population:-1}}]) ##Highest first sorted by POP STATE
  
   db.persons.aggregate([{$group: {_id:'$state', population:{$sum:1}}},{$sort: {population:-1}},{$limit:3}]) ## LIMIT to 3
   
    db.persons.aggregate([{$group:{_id:{city:'$city', state:'$state', totalpop:{$sum:'$pop'}}}}]) ##Pops by city
	
	
	 db.persons.aggregate([{$group:{_id:{city:'$city', state:'$state', totalpop:{$sum:'$pop'}}}},{$sort:{'_id.totalpop':-1}}])
	 
	  db.persons.aggregate([{$group:{_id:{city:'$city', state:'$state', totalpop:{$sum:'$pop'}}}},{$sort:{'_id.totalpop':-1}},{$limit:3}])
	  
	  BONUS
	  
	   db.persons.aggregate([{$group: {_id: "$state", avgPop:{$avg:"$pop"}}}])
	  =======================================================================================================================
	  
	  A3 
	  
	  
	  1. db.Resto.find().pretty()
	  
	  2. db.Resto.aggregate({$project: {restaurant_id:1, name:1, borough:1, cuisine:1}})
	  
	  3. db.Resto.aggregate({$project: {restaurant_id:1, name:1, borough:1, cuisine:1, _id:0}})
	  
	  4. db.Resto.aggregate({$project: {restaurant_id:1, name:1, borough:1, cuisine:1, _id:0, "address.zipcode":1}})
	  
	  5. db.Resto.aggregate({$match: {borough:'Bronx'}}, {$limit: 5}).pretty()
	  
	  6. db.Resto.aggregate({$match: {borough:'Bronx'}}).pretty()
	  
	  7. db.Resto.aggregate({$match: {borough:'Bronx'}},{$skip:5}, {$limit: 5}).pretty()
	  
	   UNWINDING
	   
	   db.Resto.aggregate([{$unwind:"$grades"}, {$project: {"grades.grade":1, _id:0, "grades.score":1}}])
	   
	  8.  db.Resto.aggregate([{$unwind:"$grades"}, {$match:{"grades.score":{$gt:90}}},{$project: {name:1,_id:0}}])
	  
	  9.  db.Resto.aggregate([{$unwind:"$grades"}, {$match:{$and:{[{"grades.score":{$gt:90}, "grades.score":{$lt:100}}}] }},{$project: {name:1,_id:0}},{$group:{_id:'$name'}}])
	  
	  9. db.Resto.aggregate([{$unwind:"$grades"},{$match: {$and: [{"grades.score":{$gt:80}}, {"grades.score":{$lt:100}}]}}]).pretty()
	  
	  10. 
	  
	  ADDRESS COORD 
	  
	  db.Resto.aggregate([{$unwind:"$address.coord"}, {$project:{name:1, "address.coord":1,_id:0}}])
	  
	  11.  db.Resto.aggregate([{$unwind:"$grades"},{$unwind:"$address.coord"}, {$match:{"grades.score":{$gt:70}, cuisine:{$ne:"American "}, "address.coord":{$lt:65.754168}}},{$project: {name:1,_id:0,cuisine:1, "address.coord":1}}])
	  
	  12. 
	  
	  13 .  db.Resto.aggregate([{$unwind: "$grades"},{$match: {cuisine:{$ne:'American'},"grades.grade":'A', borough:{$ne:'Brooklyn'}}},{$sort:{cuisine:-1}},{$project:{name:1, _id:0, cuisine:1,"grades.grade":1}} ])
	  
	  13. db.Resto.aggregate([{$unwind: "$grades"},{$match: {cuisine:{$ne:'American'},"grades.grade":'A', borough:{$ne:'Brooklyn'}}},{$project:{name:1, _id:0, cuisine:1,"grades.grade":1}},{$sort:{cuisine:-1}} ])
	  
	  14. db.Resto.aggregate({$match: {name:{$regex:"^Wil.*"}}},{$project:{name:1,_id:0}})
	  
	  15. db.Resto.aggregate({$match: {name:{$regex:".*ces$"}}},{$project:{name:1,_id:0,retaurant_id:1, borough:1, cuisine:1}})
	  
	  16. db.Resto.aggregate({$match: {name:{$regex:"Reg"}}},{$project:{name:1,_id:0,retaurant_id:1, borough:1, cuisine:1}})

	  17. db.Resto.aggregate([{$match:{"borough":'Bronx'}},{$match:{ $or: [ {cuisine:'American'}, {cuisine:'Chinese'} ] }} ,{$project:{name:1, _id:0, cuisine:1, borough:1}}])

	"AMERICAN "  ## AMERICAN HAS SPACE AFTER N 

	  17 .  db.Resto.aggregate([{$match:{"borough":'Bronx'}},{$match:{ $or: [ {cuisine:'American '}, {cuisine:'Chinese'} ] }} ,{$project:{name:1, _id:0, cuisine:1, borough:1}}])
	  
	  18.  db.Resto.aggregate([{$match:{$or:[{borough:'Staten Island'},{borough:'Queens'},{borough:'Bronx'},{borough:'Brooklyn'}]}},{$project: {restaurant_id:1, _id:0, name:1, borough:1, cuisine:1}}])
	  
	  19.  db.Resto.aggregate([{$match:{$and:[{borough:{$ne:'Staten Island'}},{borough:{$ne:'Queens'}},{borough:{$ne:'Bronx'}},{borough:{$ne:'Brooklyn'}}]}},{$project: {restaurant_id:1, _id:0, name:1, borough:1}}])
	  
	  20. db.Resto.aggregate([{$match:{"grades.score":{$lt:10}}},{$project:{_id:0,"grades.score":1}}])
	  
	  21. db.Resto.find({$or:[{name:/^Wil/}, {$and:[{cuisine:{$ne:"American "}}, {cuisine:{$ne:'Chinese'}}]}]},{name:1,borough:1,cuisine:1,_id:0})
	  
	  22. db.Resto.aggregate([{$unwind: "$grades"}, {$match:{$and:[{"grades.grade":'A'}, {"grades.date":ISODate("2014-08-11T00:00:00Z")},{"grades.score":11}]}}, {$project:{_id:0, name:1, borough:1,"grades.date":1,"grades.score":1}}])
	  
	  23. db.Resto.find({"grades.1.grade": "A", "grades.1.score":9, "grades.1.date": ISODate("2014-08-11T00:00:00Z")}, {_id:0,name:1})
	  
	  24. db.Resto.find({"address.coord.1": {$gt : 42, $lte : 52}},{"restaurant_id" : 1,"name":1,"address":1,"coord":1});
	  
	  25. db.Resto.aggregate([{$sort: {name:1}},{$limit:5}]).pretty()
	  
	  26. db.Resto.aggregate([{$sort: {name:-1}},{$limit:5}]).pretty()
	  
	  27. db.Resto.aggregate([{$sort: {cuisine:1,borough:-1}},{$limit:5}]).pretty()
	  
	  28. db.Resto.aggregate([{$match:{"address.street":{$ne:null}}},{$project:{"address.street":1}}])
	  
	  29. db.Resto.aggregate([{$match:{"address.coord":{$type:"double"}}},{$project:{name:1,_id:0,CoType:{$type:"$address.coord"}}}])
	  
	  30. db.Resto.find({"grades.score": {$mod:[7,0]}}, {"name":1, "borough":1, "grades.score":1})
	  
	  31. db.Resto.aggregate([{$match:{name:{$regex:"mon"}}},{$project:{name:1,_id:0}}])
	  
	  32. db.Resto.aggregate([{$match:{name:{$regex:"^Mad.*"}}},{$project:{name:1,_id:0,"address.coord":1}}])
	  
	  
	  

	  
 
 
 