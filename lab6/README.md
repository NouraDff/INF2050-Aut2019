# Laboratoire 6

### Comment intégrer des plugins au fichier `POM.xml`
Afin d'ajouter les plugin de Checkstyle et de PMD au build de Maven, il suffit de les ajouter ainsi. 
```
 <build>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-checkstyle-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-pmd-plugin</artifactId>
          <version>3.12.0</version>
        </plugin>
      </plugins>
  </build>s
```

Si vous souhaitez créer des rapports et ainsi visualiser les informations qui ressort de l'analyse de checkstyle et PMD, il suffit d'ajouter au `POM.xml` les balises `<reporting>` comme suit:

```
 <reporting>
    <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-pmd-plugin</artifactId>
        </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-checkstyle-plugin</artifactId>
        <version>3.1.0</version>
        <reportSets>
          <reportSet>
            <reports>
              <report>checkstyle</report>
            </reports>
          </reportSet>
        </reportSets>
      </plugin>
    </plugins>
  </reporting>
```

Ensuite vous lancer en ligne de commande ceci:
```
$ mvn site
```

Cela va générer un dossier target. Les rapports générés se trouveront dans le fichier html suivant: `target/site/project-reports.html`
