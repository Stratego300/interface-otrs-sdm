Installation environnement de développement :
============================================

- jdk-8u112-windows-x64
- STS 3.8.2.RELEASE (64 bits)
- gradle 3.1
- SourceTree (Atlassian)
- nodejs (6.9.1)
- JHipster : https://jhipster.github.io/installation/
- PostgreSQL 9.6.1 : https://www.bigsql.org/postgresql/installers.jsp
- pgAdmin III : https://www.postgresql.org/ftp/pgadmin3/release/


configuration proxy/mdp STS


Exemple de CURL opérationnel via proxy OPT :
===========================================

curl -x -i proxy-olfeo.intranet.opt:3128 -U intranet\2456BRU:xxx  http://www.google.com

curl -k -i -X POST --data "toto=titi" -H "Content-Type: application/json" http://opt16328.intranet.opt:8080/otrs

curl -k -i -X POST --data @POST_DATA.json -H "Content-Type: application/json" http://opt16328.intranet.opt:8080/otrs

curl -i -X POST --data @POST_DATA.json -H "Content-Type: application/json" http://opt16328.intranet.opt:8080/otrs

(avec contenu du json qui est encapsulé avec des simples apostrophes "'")


Exemple de GRADLE op�rationnel via proxy OPT :
=============================================

gradlew -Dhttps.proxyHost=proxy-olfeo.intranet.opt -Dhttps.proxyPort=3128 -Dhttps.proxyUser=intranet\2456BRU -Dhttps.proxyPassword=xxx build

gradlew  build


Paramètres proxy OPT :
=====================

-Dhttp.proxyHost=proxy-olfeo.intranet.opt -Dhttp.proxyPort=3128 -Dhttp.proxyUser=intranet\2456BRU -Dhttp.proxyPassword=xxx


Commande SpringBoot avec proxy :
===============================

java -Dhttp.proxyHost=proxy-olfeo.intranet.opt -Dhttp.proxyPort=3128 -Dhttp.proxyUser=intranet\2456BRU -Dhttp.proxyPassword=xxx -jar gs-consuming-rest-0.1.0.jar


Test adressage WS sur mon poste local:
=====================================

http://opt16328.intranet.opt:8080/greeting


GET Ticket OTRS (QUAL)
======================
GET https://matilde-qul.intranet.opt/otrs-ext/nph-genericinterface.pl/Webservice/GenericTicketConnectorREST/Ticket/29478?UserLogin=WS_OTRS&Password=xxx

Avec tous les articles (incluant le body)
https://matilde-qul.intranet.opt/otrs-ext/nph-genericinterface.pl/Webservice/GenericTicketConnectorREST/Ticket/29478?UserLogin=WS_OTRS&Password=xxx&AllArticles=1&Attachments=1

Ajouter les paramètres supplémentaires suivants :
AllArticles=1 		(ok fonctionne)
Attachments=1 		(ok fonctionne)
Extended=1  		(?)
DynamicFields=1  	(la plupart des valeurs sont nulles sur le ticket de test)


JIRA
====

Metadata
•	https://jira-qual.intranet.opt/rest/api/2/issue/createmeta

Ajouter une PJ :
curl -D- -k -u 2456BRU:xxx -X POST -H "X-Atlassian-Token: nocheck" -F "file=@CART.png" https://jira-qual.intranet.opt/rest/api/2/issue/OTRS-3/attachments

DOC:
===
Doc Jackson annotation : http://www.baeldung.com/jackson-annotations

Procédure ajout autorité de certication dans JVM
================================================
http://magicmonster.com/kb/prg/java/ssl/pkix_path_building_failed.html

Configuration du proxy pour NPM
===============================

Technique du fichier .npmrc

    http://stackoverflow.com/questions/25660936/using-npm-behind-corporate-proxy-pac
    C:\Users\<username>\.npmrc
    proxy=http://<username>:<pass>@proxyhost:<port>
    https-proxy=http://<uname>:<pass>@proxyhost:<port>

Support gradle dans idea
========================
gradle cleanIdea
gradle idea

git
===

Annulation de commit : git reset HEAD~