import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cockpit',
  templateUrl: './cockpit.component.html',
  styleUrl: './cockpit.component.css'
})
export class CockpitComponent implements OnInit{
  newServerName= '';
  newServerContent = '';

  constructor(){}

  ngOnInit(): void {
    
  }

  onAddServer(){

  }

  onAddBluePrint(){
    
  }

}
