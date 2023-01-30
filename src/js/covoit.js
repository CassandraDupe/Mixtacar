console.log("Bonjour")

document.getElementById("nouveau").addEventListener("click",nouveau)
document.getElementById("ancien").addEventListener("click",ancien)

function nouveau(event){
    console.log("nouveau")
    document.getElementById("mixt").nextSibling.textContent = "Bienvenue"
    document.getElementById("inscription").style.visibility = "visible"
    document.getElementById("nouveau").style.visibility = "hidden"
    document.getElementById("ancien").style.visibility = "hidden"
}

function ancien(event){
    console.log("ancien")
    document.getElementById("mixt").nextSibling.textContent = "Bienvenue"
}