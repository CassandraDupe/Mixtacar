<template>
      <v-form fast-fail @submit.prevent>
        <v-text-field v-model="depart" type="text" label="Départ"></v-text-field>
        <!-- <v-text-field v-model="firstName" label="Départ" :rules="firstNameRules"></v-text-field>  -->

        <v-text-field v-model="arrivee" type="text" label="Arrivée"></v-text-field>

        <v-text-field v-model="date" type="date" label="Date"></v-text-field>

        <v-btn type="submit" block class="mt-2">Rechercher</v-btn>
      </v-form>
  <v-btn>
    Besoin piéton
  </v-btn>


  <br><br>

  <v-btn value="lien vers proposerTrajetLieuxDepAr" onclick="self.location.href='./proposerTrajetLieuxDepAr'">
    Proposition trajet
  </v-btn>
</template>
  
<style scoped>
</style>
  
<script setup>
import trajet from "../trajet.js";
import homeComp from "../components/homeComp.vue"
</script>