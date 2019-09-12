# LAB - S3 for Static Deployments

## Deployments

* Start by creating a simple "Hello World" style React application.
* Create a repository for it on github with a proper `.gitignore` for node/react
* Run `npm run build` to create the static files
  * YES! React is actually static files, not a server

* Old Fashioned FTP
  * Start by showing an actual website hosted somewhere like godaddy.com that you have to FTP files to.
  * Download the site
  * Drag and drop the contents of that build folder to replace it with your react app
  * Talk about how awful this is.
    * Yes, people still work this way.
    * There's no way to connect to github
    * Updates become a series of emails and stoppages
* S3 To the Rescue!
  * Setup a bucket
  * Give it the right permissions
  * Open it up to serve websites
  * Drag and drop your stuff
  * Did you win?  (other than being at AWS?)
  * Kinda -- you do have a website at AWS in one region
* You don't really have to drag and drop to S3
  * Write a simple deploy script in your package.json
    * build and deploy to s3
  * Easier, but still very manual
  * Remember, you never upload the build folder to github
* Lets go Cloud and CDN this thing!
  * Setup your .env file
  * Download and run the [aws tools](https://www.npmjs.com/package/@johnfellows/aws-tools) NPM Module which creates an aws.yml file
  * Create a cloud formation build
  * Talk about what's about to happen
    * It's going to connect to github
    * It'll run your build script
    * It'll create hidden buckets
    * I'll move it all over the globe for you!
  * You Connected to master for updates, a real CI
  * Now (well, in 45 minutes), we're automated and CDN'd
    * Winning!
* Amplify this ... it's so much better
  * AWS has yet another way, Amplify.
  * Simply connect it to github repo
  * Takes about 5 minutes and the app is live
  * Connected to master for updates, a real CI

## React Client

* The app we been deploying is a simple Hello World app.
* Build a more useful app that connects to your `library` API, pulling real data from your DynamoDB
* It's important to scaffold out the app before you start. 
  * A quick diagram helps for the UI
  * UML for the actions required
  * Connection points for the API connections
* Build the app and the CSS as you go, so that it not only "works" but looks decent enough throughout the process.
  * Students should not be satisfied only in feature delivery!
* The need list all items, revel more data on a click, and allow for toggling of one property on a click of a button/link
