<template>
  <div class="about">
    <h1>This is the home page</h1>
  </div>
  <div id="form">
    <v-sheet width="300" class="mx-auto">
      <v-form fast-fail @submit.prevent>
        <v-text-field v-model="depart" type="text" label="Départ"></v-text-field>
        <!-- <v-text-field v-model="firstName" label="Départ" :rules="firstNameRules"></v-text-field>  -->

        <v-text-field v-model="arrivee" type="text" label="Arrivée"></v-text-field>

        <v-text-field v-model="date" type="date" label="Date"></v-text-field>

        <v-btn type="submit" block class="mt-2">Rechercher</v-btn>
      </v-form>
    </v-sheet>
  </div>

  <br>

  <v-btn class="milieu">
    Besoin piéton
  </v-btn>

  <br><br>

  <v-btn class="milieu">
    Proposition trajet
  </v-btn>
</template>
  
<style scoped>
.milieu {
  align-items: center;
}

#form {
  size-adjust: 25%;
}
</style>
  
<script setup>
import trajet from "../trajet.js";
import homeComp from "../components/homeComp.vue"
</script>