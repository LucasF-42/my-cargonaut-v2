![Cargonaut Logo](./mockups/img/logo.png)
# MyCargonaut
MyCargonaut is the community driven web app solution for private cargo delivering. It is a user-to-user based arangement service and works akin to an old-school black board.

In short, MyCargonaut aims to be a platform where users can offer to transport other user's cargo from point A to point B. Any monetary transactions, as well as 
communication will be handled between users; MyCargonaut will not take a single cent in cuts.


MyCargonaut was created in tandem with the THM computer science lecture 'Konzepte moderner Softwareentwicklung' as the big project of the 
semester 2020/2021.

## Technologies

My Cargonaut uses alot of different technologies to create a technologically interesting product. 
More on that in our wiki.

One interesting fact about MyCargonaut is that we are using server sided rendering for our services by utilizing [JTE](https://github.com/casid/jte), a rather new technology.

## Prerequisites

### Host
For best results, the host machine requires a modern UNIX operating system. You will need `gradle 6.7.1` or compatible 
version, as well as `openjdk15` or higher.

### Client
The client will only require a connection to the host system and any modern web browser.

## Install

MyCargonaut does not need to be installed on any client, since it's a host-rendering based web application. 
We do however need to set up the host machine:

Once all prerequisites are met, you will need to build the program with `gradle`. For that, move to the `my-cargonaut`
folder via the terminal and execute the command `gradle build`.

![Gradle build](https://imgur.com/Hg0W33E.png)

When the project has been build, you are able to simply run MyCargonaut on your host machine via the command `gradle run`.

![Gradle run](https://imgur.com/OrRCK2Z.png)

You can then open MyCargonaut from any client machine. On default the address for that would be `http://localhost:7777/`,
but this can be changed in `./src/main/java/my_cargonaut/App.java` in line `86`, simply by changing the value of 
`app.start(7777);`.


## Proof of concept

We have managed to port a version of MyCargonaut to 
[Heroku](https://kms-mycargonaut.herokuapp.com/), but do the `JTE` limitations, we were forced to abandon some features,
like persistency.

The branch can be found [here](https://github.com/LucasF-42/my-cargonaut-v2/tree/herokuDeploy). This fork is only used as a proof of concept
and may not work as well as the master or development version.

## Contributing
Pull requests are welcome, but we don't plan on continuing the work on this project. The idea & icons of MyCargonaut 
came from the lecturers of the THM class "Konzepte moderner Softwareentwicklung" and are not our intellectual property.
