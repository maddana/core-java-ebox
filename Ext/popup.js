// let search = document.getElementById('searcht');


document.addEventListener('DOMContentLoaded', function() {
  document.getElementById("searcht").addEventListener("keyup", handler);
  document.getElementById("searcht").addEventListener("paste", handler);
  document.getElementById("searcht").addEventListener("change", handler);
});

// The handler also must go in a .js file
function handler() {
  /* ... */
  document.getElementById("tbl").style.display="";
  var value = $(this).val().toLowerCase();
  value=value.replace(/\s+/g, " ");
      $("table tr").each(function(index) {
          if (index !== 0) {
  
              $row = $(this);
  
              var id = $row.find("td:first-child").text().toLowerCase();
              id=id.replace(/\s+/g, " ");
              if (id.indexOf(value) !== 0) {
                  $row.hide();
              }
              else {
                  $row.show();                  
              }
          }
      });
}