 -- User
 userId
 emailId
 UserName : String
 accountId: String
 getUser(id) -- string
 getUser() -- List<User>
 createUser(User) -- string

 -- Account
id: String
User: User
Balance: int
Transactions : List<Transaction>
createAccount(Account) --> id //POST
getAccount(userId) --> Account // get


-- Transaction
TransId
Amount
TransDate
Status
Currency

getTransaction(transId) --> Transaction // Get

createTransaction(Transaction, userId) --> TransId // POST
    -- updateAccountBalance(userId, Amount) -->

--------------------------------- Notification API ----------------------------------------
-- User events trigger Notification which gets stored

-- Notification
NotificationId : Long
UserId: String
EmailId: String
EventType: Enum
Message:String
Time: Date
Status: String

createNotification(Notification n) --> NotificationId  //POST
getNotification(userId) --> List<Notification> //GET

-- CallerService, ResponseModel, interService Communication, RESTTemplate

-- Call Notification Service is used as a Singleton
All the Components are initialized as Singleton by default

--------------------------------- Authentication using JWT ----------------------------------------
create user in auth db

-- User
createUser(UserEntity user) --> void
getUser(userName) --> UserEntity

-- Authentication
username: String
password: String
authUser(username, password) -->
        1. Validation -- userService getUser should get User
        2. TokenGenerate -- return token
    validateToken(token) -->
        return boolean based on validation logic


--Monitor health of the UserAuthentication at -
localhost:8087/actuator
localhost:8087/actuator/health
--------------------------- To do --------------------------------------------

Transaction Rollback on failure, Commit, -- lifecycle
JPA Interface injection
Logger
Filter(Authentication), interceptor(used for header validations) // before Controller is invoked
Custom query
ExceptionHandler (Response), RequestValidation(Request), DatabaseValidation(Not null ...)
Transaction +,-
Swagger(OpenAPI)
Notification(Messaging)
Lazy Initialization
Spring Batch
Eureka