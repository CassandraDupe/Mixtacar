<script setup>
import { RouterLink, RouterView } from "vue-router";
</script>

<template>
  <v-layout>
    <!--  la barre de navigation en haut -->
    <v-app-bar color="#4688f1">
      <!-- mettre l'icone dans le 'slot prepend' de 'v-app-bar' soit au début à gauche -->

      <template v-slot:append>
          <v-avatar> <img src="./image/logoMixtacarPetit.png" rounded="0" alt="logo" /> </v-avatar>
          <p class="pl-8"> </p>
          <p class="pr-4 pl-16" > NomUtilisateur </p>
          <v-avatar > <img src="./image/avatar5.png" alt="avatar" /> </v-avatar>
          <v-btn id="menu-droite"> <img src="./image/flecheBas.png" alt="Menu" /> </v-btn>
          <v-menu activator="#menu-droite">
            <!-- le menu s'affichera qd l'élément d'id 'menu-droite' ici 'v-btn' sera activé-->
            <v-list active-color="#0a50a1" bg-color="#063d65">
              <v-list-item link to="/">
                <v-list-item-title>
                  Home
                </v-list-item-title>
              </v-list-item>
              <v-list-item to="/vosTrajets">
                <v-list-item-title>
                  Vos Trajets
                </v-list-item-title>
              </v-list-item>
              <v-list-item to="/messages">
                <v-list-item-title>
                  Messages
                </v-list-item-title>
              </v-list-item>
              <v-list-item to="/profil">
                <v-list-item-title>
                  Profil
                </v-list-item-title>
              </v-list-item>
              <v-list-item to="/personnesSurLeTrottoir">
                <v-list-item-title>
                  Personnes sur le trottoir
                </v-list-item-title>
              </v-list-item>
              <v-list-item to="/deconnexion">
                <v-list-item-title>
                  Deconnexion
                </v-list-item-title>
              </v-list-item>
            </v-list>
          </v-menu>
      </template>
    </v-app-bar>

    <!--  la zone d'affichage du contenu de l'application -->
    <v-main>
      <!-- les "composant view" s'afficheront ici -->
      <RouterView />
    </v-main>
  </v-layout>
</template>

<style scoped>
.v-main {
  padding: 10px;
}

#logo {
  margin-right: 10px;
}

#espace {
  margin-left: 10px;
}
</style>
