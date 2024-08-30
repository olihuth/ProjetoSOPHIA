function changeUsernameHeader(){
    var username;
    var loginUsername;
    var search;

    search = new URLSearchParams(window.location.search)

    loginUsername = search.get('login');
    console.log(loginUsername);
    // username = loginUsername.toString;
    document.getElementById("usernameHeader").innerText = "Olá, " + loginUsername + "!";
}

function resetEditPerfilForm(){
    document.getElementById("editPerfilForm").reset();
}

function toggleFilterDropdown(){
    var element = document.getElementById("dropdownFilter");
    var hidden = element.getAttribute("hidden");

    console.log("whats wrong?");

    if (hidden) {
       element.removeAttribute("hidden");
    } else {
       element.setAttribute("hidden", "hidden");
    }
}

