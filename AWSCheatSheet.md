# Deployment with EC2 and RDS

## Background
Deploying a web app to EC2 traditionally requires writing a startup script in Bash to do things like copy your app's .jar file from S3, install dependencies, set environment variables, set up Apache with port forwarding from 80 to your app, and start up Apache. This is a lot of manual effort, and we can use Elastic Beanstalk for deployment to avoid this manual work. This doc walks through the process of deploying to EC2 and RDS with Elastic Beanstalk, and connecting your Java code to your database.

## Steps


2. Set up your Java app to use an environment variable for the database URL, username, and password. For Java apps, this will mean modifying the `spring.datasource.url, spring.datasource.username, spring.datasource.password` lines in your `application.properties` file. While in that file, also ensure the line `server.port=5000` is present, and also check that the `ddl-auto` line is set as necessary. As an example, your `application.properties` file might look like:
    ```
    spring.datasource.url=${DATABASE_URL}
    spring.datasource.username=${DATABASE_USERNAME}
    spring.datasource.password=${DATABASE_PASSWORD}
    server.port=5000
    spring.jpa.hibernate.ddl-auto=update
    ```
3. Run `./gradlew bootJar` to generate the .jar file for your app.
4. In the AWS console, go to Elastic Beanstalk and create your application.
5. Within that application, create your environment. Select Java as the engine, and start with starter code.
6. Under "More configuration options", add a database. Pick postgres as your engine, and specify a good, secure username and password.
7. Hit "create environment". (This takes about 15 minutes.)
8. Go to the "Configuration" page. Under "Database", make note of the "database endpoint".
8. Set environment variables for DATABASE_USERNAME and DATABASE_PASSWORD, with the good, secure username and password you specified earlier. Also create the DATABASE_URL environment variable, with `jdbc:postgresql://{database endpoint from the previous step goes here}/ebdb`
9. Upload your .jar file.
10. victory?
