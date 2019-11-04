# Laboratiore 5
## Git - branches
Voici les commandes que l'on utilise principalement pour utiliser les branches. 

**Créer une nouvelle branche**
```
$ git checkout -b <nom_branche>
```

**Lister les branches existantes**
```
$ git branch
```

**Changer de branch (attention il faut d'abord commit ses changement avant)**
```
$ git checkout <nom_branche>
```

**Pousser les changements de la branche vers le dépôt central** (origin: il s'agit du nom du remote, donc peut être différent selon ce que vous avez mis)
```
$ git push origin <nom_branche>
```

**Merge les changements vers une branche** 
```
$ git merge <nom_branche>
```
**Note**: le merge s'effectude du <nom_branche> vers le HEAD. Le HEAD correspond au dernier commit dans la branche où on est situé. 
En faisaint un `git log` on peut voir la liste de tous les commits et leur informations. Le 'HEAD' est identifié à la suite de l'identifiant du commit comme suit :
```
commit 7db268dc76475ab6b72535f28a6b7e98f47859a6 (HEAD -> master, origin/master)
```
Ici le HEAD est situé dans origin/master
Donc, dans cet example si je veux merge ma nouvelle_branche avec le master, je dois me déplacer dans le master `git checkout master` puis
je peux ensuite faire le merge `git merge nouvelle_branche`
