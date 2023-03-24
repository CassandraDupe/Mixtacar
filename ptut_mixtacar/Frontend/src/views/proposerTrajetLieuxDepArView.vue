<template>
  <p class="pt-10"> </p>
  <div id="form">
    <v-sheet width="300" class="mx-auto">
      <v-form fast-fail @submit.prevent>
        <v-text-field v-model="lieuDepart" type="text" label="Lieu de départ :"></v-text-field>
        <!-- <v-text-field v-model="firstName" label="Départ" :rules="firstNameRules"></v-text-field>  -->

        <v-text-field v-model="lieuArrivee" type="text" label="Lieu d'arrivée :"></v-text-field>

        <v-btn type="submit" block class="mt-2" value="lien vers vosTrajetsItineraire" onclick="self.location.href='./proposerTrajetItineraire'">Suivant</v-btn> 
      </v-form>
    </v-sheet>
  </div>
</template>
<style scoped>

</style>

<script setup>
import proposerTrajetLieuxDepArComp from "../components/proposerTrajetLieuxDepArComp.vue"
import proposerTrajetItineraireView from "./proposerTrajetItineraireView.vue";
</script>