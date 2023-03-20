<script setup>
import { RouterLink, RouterView } from "vue-router";
</script>

<template>
  <v-layout>
    <!--  la barre de navigation en haut -->
    <v-app-bar color="primary" density="compact">
      <!-- mettre l'icone dans le 'slot prepend' de 'v-app-bar' soit au début à gauche -->

      <template v-slot:append>
        <v-avatar> <img src="./image/logoMixtacar.png" rounded="0" alt="logo" /> </v-avatar>
        <p> NomUtilisateur </p>
        <v-avatar> <img src="./image/avatar5.png" alt="avatar" /> </v-avatar>
        <v-btn id="menu-droite"> <img src="./image/flecheBas.png" alt="Menu" /> </v-btn>
        <v-menu activator="#menu-droite">
          <!-- le menu s'affichera qd l'élément d'id 'menu-droite' ici 'v-btn' sera activé-->
          <v-list>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/">Home</RouterLink>
              </v-list-item-title>
            </v-list-item>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/vosTrajets">Vos trajets</RouterLink>
              </v-list-item-title>
            </v-list-item>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/messages">Messages</RouterLink>
              </v-list-item-title>
            </v-list-item>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/profil">Profil</RouterLink>
              </v-list-item-title>
            </v-list-item>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/personnesSurLeTrottoir">Personnes sur le trottoir</RouterLink>
              </v-list-item-title>
            </v-list-item>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/deconnexion">Deconnexion</RouterLink>
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
</style>
