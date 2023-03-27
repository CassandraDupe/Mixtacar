drop table if exists messagerie;
drop table if exists conversation;
drop table if exists message;
drop table if exists note;
drop table if exists trajet;
drop table if exists besoin;
drop table if exists circuit;
drop table if exists arret;
drop table if exists utilisateur;
drop table if exists preference;


create table preference(
	identif int not null primary key,
	nom varchar(10) not null,
	etat boolean not null
);

create table utilisateur(
	id int not null primary key AUTO_INCREMENT,
	nom varchar(30) not null,
	prenom varchar(30) not null,
	adresse_mail varchar(50) not null,
	mdp varchar(50) not null,
	descript varchar(150),
	preferences int,
	constraint fk_preference foreign key(preferences) references preference(identif)
);

create table arret(
	id_arret int not null primary key,
	nom Varchar(50) not null,
    lat float8 not null,
	lon float8 not null
);

create table circuit(
	id_circuit int not null primary key,
	depart int,
	arrivee int,
	horaire date,
	constraint fk_circuit_arret_depart foreign key(depart) references arret(id_arret),
	constraint fk_circuit_arret_arrivee foreign key(arrivee) references arret(id_arret)
);

create table besoin(
	id_besoin int not  null primary key,
	urgent boolean not null,
	conducteur boolean default FALSE,
	nbre_demandes int not null,
	id_util int,
	constraint fk_besoin_circuit_circuit foreign key (id_besoin) references circuit(id_circuit),
	constraint fk_besoin_utilisateur foreign key (id_util) references utilisateur(id)
);

create table trajet(
    id_trajet int not null primary key,
    conducteur int,
    nbPlace int not null,
    constraint fk_trajet_circuit foreign key (id_trajet) references circuit(id_circuit),
    constraint fk_trajet_utilisateur foreign key (conducteur) references utilisateur (id)
);


create table note(
	id_note int not null primary key,
	valeur int not null,
	notant int not null,
	notee int not null,
	constraint fk_notant_utilisateur foreign key (notant) references utilisateur(id),
	constraint fk_notee_utilisateur foreign key (notee) references utilisateur(id)
);

create table message(
	id_message int not null primary key,
	type varchar(10),
	contenu varchar not null,
	envoi date,
	recepteur int,
	envoyeur int,
	constraint fk_recepteur_utilisateur foreign key (recepteur) references utilisateur(id),
	constraint fk_envoyeur_utilisateur foreign key (envoyeur) references utilisateur(id) 
);

create table conversation(
	id_conversation int not null primary key,
	id_message int,
	constraint fk_conversation_message foreign key (id_message) references message(id_message)
);

create table messagerie(
	id_messagerie int not null primary key,
	id_conversation int,
	id_proprio int,
	constraint fk_messagerie_conversation foreign key (id_conversation) references conversation(id_conversation),
	constraint fk_message_utilisateur foreign key (id_proprio) references utilisateur(id)
 );


-- -----------------------------------------------------------------------------
--  	Nom de la base : mixtacarBdd
--  	Auteur : Mélanie FERON
--  	Date de derniere modification : 13/02/2023
-- -----------------------------------------------------------------------------

INSERT INTO utilisateur VALUES(0, 'DUPE','Cassandra','cassandra.dupe@etud.univ-jfc.fr','je@meconnecte');
INSERT INTO utilisateur VALUES(1, 'AUBERT','Coline','coline.auber@etud.univ-jfc.fr','Ratchoum!');
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
