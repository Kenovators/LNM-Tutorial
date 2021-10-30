# Lipa Na MPesa Android Integration Tutorial
## What is LNM?
Lipa Na Mpesa(LNM) is a payment SDK offered by Safaricom service provider, that facilitates easy payment integration in mobile and web applications by a sim toolkit(STK) push message.
The STK push asks for a pin for the app user to authorize the payments, then the transaction is saved on the backend of the application.

##Integration
To quickly integrate the system to your existing app, do:
1. Clone the repository
2. Copy the AppConstants.java, MainActivity.java (Remember to rename it and add to manifest), & mpesa directory with all its content.
3. Copy the dependencies in build.gradle(app) and add them to yours
4. Copy the two lines at the end of gradle.properties
5. Change values in AppConstants.java
6. Refactor and run your application

## Callback URL
This is the URL that the Service provider(Safaricom) will use to send payment information to your backend.
For callback url, look at this repository for sample code you can host: https://github.com/Kenovators/LNM-Callback-Url
