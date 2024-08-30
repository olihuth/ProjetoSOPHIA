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
    // document.getElementById("dropdownFilter");
    var element = document.getElementById("dropdownFilter");
    var hidden = element.getAttribute("hidden");

    console.log("whats wrong?");

    if (hidden) {
       element.removeAttribute("hidden");
       console.log("hidden = " + hidden);
    //    button.innerText = "Hide div";
    } else {
       element.setAttribute("hidden", "hidden");
       console.log("hidden = " + hidden);
    //    button.innerText = "Show div";
    }
}

