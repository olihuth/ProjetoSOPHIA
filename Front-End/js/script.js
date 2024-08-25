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

