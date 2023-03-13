<template>
  <div>
    <h1>This is "Vos trajets - lieux depart et arrivé" page</h1>
  </div>
  <div id="form">
    <v-sheet width="300" class="mx-auto">
      <v-form fast-fail @submit.prevent>
        <v-text-field v-model="lieuDepart" type="text" label="Lieu de départ :"></v-text-field>
        <!-- <v-text-field v-model="firstName" label="Départ" :rules="firstNameRules"></v-text-field>  -->

        <v-text-field v-model="lieuArrivee" type="text" label="Lieu d'arrivée :"></v-text-field>

        <v-btn type="submit" block class="mt-2">Suivant</v-btn>
      </v-form>
    </v-sheet>
  </div>
</template>

<style scoped>

</style>

<script setup>
import vosTrajetsLieuxDepArComp from "../components/vosTrajetsLieuxDepArComp.vue"
</script>