import { Component, OnInit, EventEmitter, Output, ViewEncapsulation, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-cockpit',
  templateUrl: './cockpit.component.html',
  styleUrl: './cockpit.component.css',
  encapsulation: ViewEncapsulation.None,
})
export class CockpitComponent implements OnInit{
  @Output() serverCreated = new EventEmitter<{serverName: string, serverContent: string}>;
  @Output() blueprintCreated = new EventEmitter<{serverName: string, serverContent: string}>;
  @ViewChild('serverContentInput', {static: true}) serverContentInput: ElementRef

  constructor(){}

  ngOnInit(): void {
  }

  onAddServer(nameInput: HTMLInputElement){
    this.serverCreated.emit({
      serverName: nameInput.value, 
      serverContent: this.serverContentInput.nativeElement.value
    });
  }

  onAddBluePrint(nameInput: HTMLInputElement){
    this.blueprintCreated.emit({
      serverName: nameInput.value,
      serverContent: this.serverContentInput.nativeElement.value
    })
  }

}
