# Battle of Stalingrad (with MongoDB + SpringBoot + Swagger UI + Docker)


## Prerequisites

* Java 11-16, Maven MongoDB Compass
* Docker Desktop
* Note that Due to time constraint and lack of knowledge I was not able to configure docker-compose.yaml file, instead I used Docker Desktop to run two local containers at the same time

## The data model

An example of a data log looks like this:
```json
[
  {
    "id": 0,
    "tanks": [
      43,
      56
    ],
    "mapId": 1,
    "score": "1-0 You won the Battle",
    "dead": false,
    "tankName": "German Tank",
    "tankHealth": 100,
    "turret": "Standby",
    "track": "Stop",
    "obstacles": [
      20,34
    ],
    "mapSize": [
      50
    ],
    "killedTheEnemy": true
  }
```
**Readme**:

Initially I was going for a 2 dimensions array to better represent the map, but after seeing the example in the test I went with a one dimension array, same with the obstacles array
* `Note`: The main Controller for this project is the Simulate Controller

## Connection to the MongoDB with Mongo Compass

* `NOTE IMPORTANT`: Paste this in the Mongo Compass GUI and click connect to see the changes 
* `Adress`: mongodb+srv://admin:admin@clusterproject.aykwp.mongodb.net/test?authSource=admin&replicaSet=atlas-nw9e0p-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true
  ![Swagger UI](MongoDBString.jpg)
## REST Endpoints

![Swagger UI](REST%20Endpoints.jpg)

## Run the App

Compile the source code or pull de repo from docker and run it locally docker pull beneguiandrei76/tank-spring-mongo
After the pull is complete open Docker Desktop you should see the local repositories.

![Swagger UI](RunTheTankApp.jpg)
![Swagger UI](dockerhubrun.png)

Click on the run button - there you will have to make two containers with a random name and specify the local host.
![Swagger UI](firstSessionPort8080.png)
![Swagger UI](secondsessionPort8081.png)
The first container should have port 8080 and the second should have port 8081
![Swagger UI](twoContainers.png)

After building the two container the REST requests can also be run on a second session in parallel on http://localhost:8081/swagger-ui.html

**For Example**:
![Swagger UI](example1.png)
![Swagger UI](example2.png)


**Store and Delete**:
* `createScore`:Create a score with the mentioned schema. Also be sure to create an alive tank by changing dead:false and change killedTheEnemy:false
* `deleteSimulate`: Delete the entry with the specific object id You can use it to delete an entry.

![Swagger UI](state.jpg)


**Update logs**:
* `updateScore`: Updates score will only update the dead state and based on the dead state the tankHealth is either 100 or 0
and it will also update if the current tank has killedTheEnemy, if the state is true the score will update and the battle is won.
  I did not add an extra logic for those two states so if both of them are true it will activate the logic for killedTheEnemy.
  * `updateAllVariables`: Updates all the json schema
* `Note`: Also be sure to specify the OBJECT ID of the tank you want to update
* `Note`: Due to time constraints, I was not able to make a functioning mini AI to move the tanks through the map array and avoid the obstacles array.

**Display logs**:
* `findSimulate`: Search all log entries.
* `finSimulateById`: Search logs by a specific id.

## Showcase

* `First Step`: We create by clicking the execute button and we can see the MongoDB the entry
![Swagger UI](create.jpg)
  ![Swagger UI](examplemongo.jpg)
* `Second Step`: We update one of the two states, dead or killedTheEnemy using POST in this example we will update killedTheEnemy
  ![Swagger UI](Update.jpg)
  ![Swagger UI](updateState.jpg)
  
* `Note`: I made a couple of tanks in the database to play with but feel free to add/modify/delete/find.

## Side note
**Other Controllers**: I created the other controllers Tank/World Controller to learn REST