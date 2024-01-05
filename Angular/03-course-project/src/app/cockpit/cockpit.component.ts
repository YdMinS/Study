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

  onAddServer(){
    this.serverCreated.emit({
      serverName: this.newServerName, 
      serverContent: this.newServerContent
    });
  }

  onAddBluePrint(){
    this.blueprintCreated.emit({
      serverName: this.newServerName,
      serverContent: this.newServerContent
    })
  }

}
