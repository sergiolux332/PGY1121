import numpy as np
vmatriz=np.array([[1,2,3,4,5,6,7,8,9,10],[11,12,13,14,15,16,17,18,19,20],[21,22,23,24,25,26,27,28,29,30],[31,32,33,34,35,36,37,38,39,40],[41,42,43,44,45,46,47,48,49,50]])

def fun_reserva(a):
    if a in vmatriz:
        print("asiento disponible")
        for vf in range(5):
            for vc in range(10):
                if vmatriz[vf][vc]==a:
                    vmatriz[vf][vc]=0
    else:
        print("asiento no disponible")

def fun_disponibles():
    for vf in range(5):
            vlista=[]

            for vc in range(10):
                if vmatriz[vf][vc]>0:
                    vlista.append(vmatriz[vf][vc])
            print(vlista)

def fun_asistentes():
    for vf in range(5):
        vlista=[]
        
        for vc in range(10):
            if vmatriz[vf][vc]==0:
                vlista.append(vmatriz[vf][vc])
        print(vlista)

sw=0
while sw==0:
    print("menu principal")
    print("============================================")
    print("Opcion 1: Comprar entradas")
    print("Opcion 2: Mostrar ubicaciones disponibles")
    print("Opcion 3: Ver listado de asistentes")
    print("Opcion 4: Mostrar ventas totales")
    print("Opcion 5: Salir")
    print("===========================================")
    
    try:
        vOp=int(input("Digite Opcion: "))
    except:
        print("Opcion invalida")    

    else:
        if vOp==1:
            try:
                vCantidad= int(input("Igrese la cantidad de entradas <4: "))
                if vCantidad<0 or vCantidad>3:
                    print("cantidad solicitada esta fuera de rango")
                else:
                      print(vmatriz)
                      for n in range(vCantidad):
                        vasiento=int(input("ingrese el numero de asiento: "))  
                        fun_reserva(vasiento)
                        print(vmatriz)
                    
            except:
                print("error de ingreso")

            
        elif vOp==2:
            fun_disponibles()
            
        elif vOp==3:
            fun_asistentes()
            continue
        elif vOp==4:
            continue
        elif vOp==5:
            sw=1
        else:
            print("Opcion digitada no esta en el menu")

print("PROGRAMA FINALIZADO...")