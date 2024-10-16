# Basic TO DO LIST with CRUD operations

CRUD stands for :
- C => Create (Post Method)
- R => Read (Get Method)
- U => Update (Put Method)
- D => Delete (Delete Method)

## Techs that I used :

- [x] Java 21
- [x] Spring Boot
- [x] Spring Data
- [x] H2 Database
- [x] Swagger for Documentation 
- [x] Maven


---

<img src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt="drawing" width="50"/> ![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white) 
<img src="https://user-images.githubusercontent.com/25181517/183891303-41f257f8-6b3d-487c-aa56-c497b880d0fb.png" alt="drawing" width=50>
<img src="https://user-images.githubusercontent.com/25181517/117207242-07d5a700-adf4-11eb-975e-be04e62b984b.png" alt="drawing" width=50>
<img src="https://user-images.githubusercontent.com/25181517/183894676-137319b5-1364-4b6a-ba4f-e9fc94ddc4aa.png" alt="drawing" width=50>

---    

## Usage
1. Copy link below
``` git
    git clone https://github.com/RonayBagci/basic_to_do_list.git
```

2. Open the folder and navigate backend/demo path. 

3. With maven run these commands:
```git
$mvn clean install
$mvn spring-boot:run
```
If you want to stop the application click **CTRL+C** in terminal.

4. Spring Boot app is going to run on the http://localhost:8080/ 

## For Swagger API Documantation

Swagger API documentation will show at here 
<a href="http://localhost:8080/swagger-ui.html#/" target="_blank">http://localhost:8080/swagger-ui.html#/</a>

### Swager Screenshoot:
![image 1](backend/demo/images/1.png)


## Docker Usage
If you want to use docker you should follow the steps at bellow

1. Pull docker image 
``` git
docker pull ronay44/todoapp
```
2. Build Docker image
```git
docker build -t todoapp:latest .
```
3. Run docker with
``` git
docker run --name todoapp -d -p 8080:8080 todoapp:latest
```











