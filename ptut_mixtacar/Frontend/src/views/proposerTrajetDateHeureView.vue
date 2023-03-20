<template>
  <div>
    <h1>This is the "Poposer trajet - date et heure" page</h1>
  </div>
  <v-container>
    <h1> Quel date et quelle heure? </h1>
    <br>
    <v-form fast-fail @submit.prevent>
      <v-text-field v-model="heure" type="datetime-local" label="Heure"></v-text-field>
    </v-form>
  </v-container>
  <v-container>
    <v-btn type="submit" block class="mt-2" value="lien vers proposerTrajetNbPlaceResDir" onclick="self.location.href='./proposerTrajetNbPlaceResDir'">Suivant</v-btn>
  </v-container>
</template>
  
<style scoped></style>
  
<script setup>
  import proposerTrajetNbPlaceResDirView from "./proposerTrajetNbPlaceResDirView.vue";
</script>