import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

flag: boolean;
vehicles : string[]; 
selectedVehicle : string = "";
myStyle : {};
myClass : {};

constructor()
{
  this.flag = true;
  this.vehicles = ["TwoWheeler","ThreeWheeler","FourWheeler"];
  this.myStyle = {'width' : '40%','border':'2px solid black' }
  this.myClass = "MyClass1";
}

changeFlag()
{
  this.flag=! this.flag;
}

setSelectedItem(vec : string){
  this.selectedVehicle =vec;
}
changeClass(){
  this.myClass="MyClass2";
}
}


