import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import {SynonymeService} from '../../service/synonyme.service'
import { HighlightDelayBarrier } from 'blocking-proxy/built/lib/highlight_delay_barrier';
@Component({
    selector: 'app-grid',
    templateUrl: './grid.component.html',
    styleUrls: ['./grid.component.scss'],
    animations: [routerTransition()]
})
export class GridComponent implements OnInit {
    synonyme: any;
    syn: any;
    hide : boolean;
    i: number;
    
    constructor(private synonymeservice:SynonymeService) {}

    ngOnInit() {
        this.hide = false ;
        this.synonymeservice.getsynonyme().subscribe(data => {
            this.synonyme = data;
          });
    }

   
  hiden(i:number) {
   
  
   this.synonymeservice.getsyn(i).subscribe(data => {
    this.syn = data;
});
}
}
