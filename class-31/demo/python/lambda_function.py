import json
import sys

def lambda_handler(event, context):
   sum = event["a"] + event["b"]
   sys.stdout.write("The Sum Is: " + str(sum))
   return sum
