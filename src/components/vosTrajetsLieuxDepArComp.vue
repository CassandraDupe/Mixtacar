<template>
</template>

<style scoped>
</style>

<script>
export default {
  data: () => ({
    lieuDepart: '',
    lieuRules: [
      value => {
        //if (value?.length > 3) return true
        //return 'lieu must be at least 3 characters.'

        return true
      },
    ],
    lieuArrivee: '',
    lieuRules: [
      value => {
          return true

      },
    ],
  }),
}
</script>