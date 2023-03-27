<template>
  <p class="pt-10"> </p>
  <v-container>
    <v-row> <!-- ligne -->
      <v-col cols="12" md="6" class="d-flex justify-center">
        <h1>
          <img src="../image/voiture4_petit.png" alt="livres" />
        </h1>
      </v-col> <!-- colonne -->
    </v-row>

    <v-row> <!-- ligne -->
      <v-col cols="12" md="6" class="">

        <v-form fast-fail @submit.prevent>
          <v-text-field v-model="depart" type="text" label="Départ"></v-text-field>
          <!-- <v-text-field v-model="firstName" label="Départ" :rules="firstNameRules"></v-text-field>  -->

          <v-text-field v-model="arrivee" type="text" label="Arrivée"></v-text-field>

          <v-text-field v-model="date" type="date" label="Date"></v-text-field>

          <v-btn type="submit" block class="mt-2" color="#4688f1">Rechercher</v-btn>
        </v-form>
        <br>
        <br>

      </v-col> <!-- colonne -->
    </v-row>

    <v-row> <!-- ligne -->
      <v-col cols="12" md="6" class="d-flex justify-center">
        <v-btn block class="mx-10">
          Besoin piéton
        </v-btn>
      </v-col> <!-- colonne -->
    </v-row>
    <v-row> <!-- ligne -->
      <v-col cols="12" md="6" class="d-flex justify-center">
        <v-btn value="lien vers proposerTrajetLieuxDepAr" onclick="self.location.href='./proposerTrajetLieuxDepAr'"
          color="#4688f1" block class="mx-10">
          Proposition trajet
        </v-btn>
      </v-col> <!-- colonne -->
    </v-row>
  </v-container>
</template>
  
<style scoped></style>
  
<script setup>
import trajet from "../trajet.js";
import homeComp from "../components/homeComp.vue"
</script>