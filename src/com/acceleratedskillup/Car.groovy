package com.acceleratedskillup

class Car {
      def name="Lemo";
      def NoofDoors="20"
      def script=null 

       Car(script)
       { this.script=script
       }

      def printcarout(){
          script.echo "Printing the car out using the script.echo script object passed to library Class method"
	  script.echo "Car Name : ${this.name}"
	  script.echo "Number of doors: ${this.NoofDoors}"

      }




}
