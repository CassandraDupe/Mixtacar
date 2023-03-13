<template>
</template>

<style scoped>
</style>

<script>
export default {
  data: () => ({
    depart: '',
    lieuRules: [
      value => {
        //if (value?.length > 3) return true
        //return 'lieu must be at least 3 characters.'

        return true
      },
    ],
    arrivee: '',
    lieuRules: [
      value => {
          return true

      },
    ],
    date: '',
    dateRules: [
      value => {
         return true
      },
    ],
  }),
}
</script>