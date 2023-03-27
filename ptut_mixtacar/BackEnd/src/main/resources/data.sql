-- Demander comment faire pour générer automatiquement la
-- valeur de la primary key

INSERT INTO utilisateur VALUES(1, 'AUBER','Coline','coline.auber@etud.univ-jfc.fr','Ratchoum!');
INSERT INTO utilisateur VALUES(2, 'FERON','Mélanie','melanie.feron@etud.univ-jfc.fr','Oupsi@45?');

INSERT INTO arret VALUES(0,'ISIS',43.62504714626731, 2.2691637152404454);
INSERT INTO arret VALUES(1,'SuperU',43.62166095026758, 2.2692495459245734);
INSERT INTO arret VALUES  (2,'Les Ateliers',43.602434722823006, 2.2533600134717204);
INSERT INTO arret VALUES  (3,'Faïencerie',43.61026136347053, 2.2364788227495556);
INSERT INTO arret VALUES  (4,'Place Jean-Jau',43.605548577991456, 2.2414236097831846);

INSERT INTO circuit VALUES (0,4, 0);
INSERT INTO circuit VALUES (1,2, 1);

INSERT INTO besoin (id_besoin,urgent,nbre_demandes,ID_util)
VALUES (0,true,2,2);
VALUES (1,false,1,1);

insert into trajet (id_trajet, conducteur, nbPlace)
values (1, 2, 3);
values(1, 2, 1);