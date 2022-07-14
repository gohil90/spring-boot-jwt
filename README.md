# Spring Security with JWT Token

## Login request API
This API can be used to login with username/password and will return JWT token along with userId (if you need) & roles of the user configured in DB.

- URL: http://localhost:8080/api/auth/login
- Method: POST
- Request Body: 
<pre>
{
    "username": "user",
    "password": "[PASSWORD]"
}
</pre>
- Response:
<pre>
{
    "token": "[USER_TOKEN]",
    "id": 2,
    "username": "user",
    "roles": [
        "user"
    ]
}
</pre>

## User API
### Users with only <i>user</i> role can only be able to hit below URL

- URL: http://localhost:8080/api/test/user
- Method: GET
- Request Header
<pre>
Authorization: Bearer [USER_TOKEN]
</pre>
- Response:
<pre>
Status: 200 OK
</pre>

### If users with role <i>user</i> try to access admin URL. It will be forbidden.

- URL: http://localhost:8080/api/test/admin
- Method: GET
- Request Header
<pre>
Authorization: Bearer [USER_TOKEN]
</pre>
- Response:
<pre>
Status: 403 Forbidden
</pre>


## Admin API
### Users with <i>admin</i> role can be able to hit /user URL

- URL: http://localhost:8080/api/test/user
- Method: GET
- Request Header
<pre>
Authorization: Bearer [ADMIN_TOKEN]
</pre>
- Response:
<pre>
Status: 200 OK
</pre>

### Users with <i>admin</i> role can also be able to hit /admin URL
- URL: http://localhost:8080/api/test/admin
- Method: GET
- Request Header
<pre>
Authorization: Bearer [ADMIN_TOKEN]
</pre>
- Response:
<pre>
Status: 200 OK
</pre>