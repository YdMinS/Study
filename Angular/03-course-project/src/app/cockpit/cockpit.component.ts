import { Component, OnInit, EventEmitter, Output, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-cockpit',
  templateUrl: './cockpit.component.html',
  styleUrl: './cockpit.component.css',
  encapsulation: ViewEncapsulation.None,
})
export class CockpitComponent implements OnInit{
  @Output() serverCreated = new EventEmitter<{serverName: string, serverContent: string}>;
  @Output() blueprintCreated = new EventEmitter<{serverName: string, serverContent: string}>;
  newServerName= '';
  newServerContent = '';

  constructor(){}

  ngOnInit(): void {
  }

  onAddServer(serverInput: HTMLInputElement){
    this.serverCreated.emit({
      serverName: serverInput.value, 
      serverContent: this.newServerContent
    });
  }

  onAddBluePrint(serverInput: HTMLInputElement){
    this.blueprintCreated.emit({
      serverName: serverInput.value,
      serverContent: this.newServerContent
    })
  }

}
