import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'pratice1';
  name : string;
  age : number;
  email : string;
  txtColor : string;
  image : string;
  fname : string = "";

  constructor(){
    this.name = "dhachu";
    this.age = 20;
    this.email = "dhachu@gmail.com";
    this.txtColor = "green";
    this.image = "./assets/logo2.png";
    this.fname = "dhachu !!";
    
  }
  getAddition(a:number , b:number){
    let sum = a+b;
    return sum;
  }
  changeName(){
    this.name = "dharshana";
  }
  changeAge(){
    this.age = 21;
  }
  changeEmail(){
    this.email = "dharshanaravi@gmail.com";
  }
  changeImage(){
    this.image = "./assets/logo2.png";
  }
}
