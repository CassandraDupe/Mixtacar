<script setup>
import { RouterLink, RouterView } from "vue-router";
</script>

<template>
  <v-layout>
    <!--  la barre de navigation en haut -->
    <v-app-bar color="primary" density="compact">
      <!-- mettre l'icone dans le 'slot prepend' de 'v-app-bar' soit au début à gauche -->
      <template v-slot:prepend>
        <!--  un clic sur l'icone cache/affiche la zone de menu de gauche -->
        <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      </template>

      <template v-slot:append>
        <!-- <RouterLink to="/messages">Librairie</RouterLink> -->
        <v-btn id="menu-droite"> Menu </v-btn>
        <v-menu activator="#menu-droite">
          <!-- le menu s'affichera qd l'élément d'id 'menu-droite' ici 'v-btn' sera activé-->
          <v-list>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/home">Home</RouterLink>
              </v-list-item-title>
            </v-list-item>
            <v-list-item>
              <v-list-item-title>
                <RouterLink to="/vos_trajets">Vos trajets</RouterLink>
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
                <RouterLink to="/personnes_sur_le_trottoir">Personnes sur le trottoir</RouterLink>
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
      <v-container fluid>
        <!-- les "composant view" s'afficheront ici -->
        <RouterView />
      </v-container>
    </v-main>
  </v-layout>
</template>

<style scoped>
.v-main {
  padding: 10px;
}
</style>
