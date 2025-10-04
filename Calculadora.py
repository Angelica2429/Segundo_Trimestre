import tkinter as tk

root = tk.Tk()
root.title("Hola Tkinter")
label = tk.label(root, text="Bienvenido a Tkinter")
label.pack()
button = tk.label(root, text="Salir", command=root.destroy)
button.pack()
root.mainloop()
