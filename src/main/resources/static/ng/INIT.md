

install
=======

yarn global add @angular/cli
see <https://angular.io/cli>

$ ng new ng
(choose router-y and CSS only (no LESS or SASS))

after a while and another stupid question do

init project
------------
$ cd ng
$ ng serve
$ ng generate component hello
add the line to the router file(app-routing-module), use auto completion (of vscode) for import

    { path: 'hello', component: HelloComponent },

Code
====

router
------

documentation notes
<a [routerLink]="['/hero', hero.id]">
  this.router.navigate(['/heroes']);
  The observable router
   this.hero$ = this.route.paramMap.pipe(
    switchMap((params: ParamMap) =>
      this.service.getHero(params.get('id')))
  );
    let id = this.route.snapshot.paramMap.get('id');

    route is injected in a classical way

       constructor(
        private route: ActivatedRoute,
        private router: Router,
        private service: PostService
      ) {}
