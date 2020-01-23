var alignments = [];

window.onload = function () {
    /*fetch("http://localhost:8080/clcl/api/entAlignment/showalign", {method: 'GET'})
    .then(response => {
        if (response.status >= 200 && response.status <= 299) {
            return response.json();
    }}).then(body => {
        console.log(body);
    });*/
    var alHttp = new XMLHttpRequest();
    alHttp.open(method='GET', url='http://localhost:8080/clcl/Alignment/findAll', async='true');
    alHttp.send();
    
    if (alHttp !== 200) {
        alert(alHttp.status + ': ' + alHttp.statusText);
    } else {
        alignments = (JSON.parse(alHttp.response));
    }
    
    console.log(alignments);
    
    var alTab = document.getElementById("alTable");
    alTab.innerHTML = "";
    
    var thID = document.createElement("th");
    var thAL = document.createElement("th");
    
    thID.append("ID");
    thAL.append("Alignment");
    
    for (var i = 0; i < alignments.length; i++) {
        var tr = document.createElement("tr");
        var tdID = document.createElement("td");
        var tdAL = document.createElement("td");
        
        tdID.append(alignments[i].id);
        tdAL.append(alignments[i].alignname);
        
        tr.append(tdID);
        tr.append(tdAL);
        alTab.append(tr);
    }
};
