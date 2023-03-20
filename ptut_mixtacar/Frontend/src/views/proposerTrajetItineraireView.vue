<template>
  <v-container>
    <v-row> <!-- ligne -->
      <v-col cols="12" md="6" class="d-flex justify-center">
        <h1>Votre trajet :
          <img src="../image/carte_moyenne.png" alt="livres" />
        </h1>
      </v-col> <!-- colonne -->
    </v-row>
  </v-container>
  <v-container>
    <v-row> <!-- ligne -->
      <v-col cols="12" md="6" class="d-flex justify-center">
        <h1>
          Choisissez un itinéraire :
          <v-container fluid>
            <p>{{ selected }}</p>
            <v-checkbox v-model="selected" label="Itinéraire 1" value="Itinéraire1"></v-checkbox>
            <v-checkbox v-model="selected" label="Itinéraire 2" value="Itinéraire2"></v-checkbox>
          </v-container>
        </h1>
      </v-col> <!-- colonne -->
    </v-row>
  </v-container>
  <v-container>
    <v-btn type="submit" block class="mt-2" value="lien vers vosTrajetsDateHeure" onclick="self.location.href='./proposerTrajetDateHeure'">Suivant</v-btn> 
  </v-container>
</template>
  
<style scoped></style>
  
<script setup>
import proposerTrajetItineraireComp from "../components/proposerTrajetItineraireComp.vue";
import proposerTrajetDateHeureView from "./proposerTrajetDateHeureView.vue";
</script>