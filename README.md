# consul-vault-connection-spring-boot

1- download vault 
2- open command line : 
.\vault.exe server -dev
3- the server is running on http://127.0.0.1:8200

![6](https://user-images.githubusercontent.com/36199753/115152659-d629b580-a069-11eb-8d16-5ffc742dce22.PNG)

4- configuration : we create 2 folders in the the default engine (secret) named application and application3
![1](https://user-images.githubusercontent.com/36199753/115152666-de81f080-a069-11eb-81ee-3d7d1e9c4921.PNG)
![2](https://user-images.githubusercontent.com/36199753/115152668-df1a8700-a069-11eb-8f8b-97e2c20310cc.PNG)
![3](https://user-images.githubusercontent.com/36199753/115152669-dfb31d80-a069-11eb-8164-92dbfeebb4e1.PNG)

here we create another engine with name application2 not the the default one which is secret and then we create as default-context a folder name credentials
the configuration exist with comment in the bootstrap.proprties

![4](https://user-images.githubusercontent.com/36199753/115152670-dfb31d80-a069-11eb-84a8-81d3d961b5a6.PNG)
![5](https://user-images.githubusercontent.com/36199753/115152671-e04bb400-a069-11eb-92ed-a41667e4de36.PNG)


