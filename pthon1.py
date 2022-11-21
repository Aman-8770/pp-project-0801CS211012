import pandas as pd
import numpy as np
class parking:
    pass
bike = parking()
car = parking()
bike.OwnerName=[]
bike.VehicleNo=[]
bike.pswd=[]
car.OwnerName=[]
car.VehicleNo=[]
car.pswd=[]
def BikeDetail(name,VehicleNo,pswd):
  bike.OwnerName.append(name)
  bike.VehicleNo.append(VehicleNo)
  bike.pswd.append(pswd)
def CarDetail(name,VehicleNo,pswd):
  car.OwnerName.append(name)
  car.VehicleNo.append(VehicleNo)
  car.pswd.append(pswd)

print("enter 1 for putting the vehicle in the parking\n enter 2 for taking out the vehicle from the parking ")
operation = int(input())
if operation == 1:
   OwnerName = input("enter your name")
   VehicleNo = input("enter you vehicle no")
   pswd = input("enter your secreat password")
   t = input("which type of vehicle you want to put")
   if t == "car":
     CarDetail(OwnerName,VehicleNo,pswd)
   elif t == "bus":
     BikeDetail(OwnerName,VehicleNo,pswd)    







