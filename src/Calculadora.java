import javax.swing.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;

import java.awt.event.FocusListener;

public class Calculadora extends JFrame {
    String memoria1;
    String signo;
    String memoria2;

    private JPanel contentPane;
    private JTextField txtPantalla;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Todos los eventos en cada proceso se debe recargar la GUI
        //Osea, se recarga la interfaz
        //Para evitar la no recarga de la GUI
        //Se realiza el siguiente codigo, en donde el Runnable() es el evento
        EventQueue.invokeLater(new Runnable() {
                                   public void run() {
                                       try {
                                           Calculadora frame = new Calculadora();
                                           frame.setVisible(true);
                                       } catch (Exception e) {
                                           //Ubica en donde pudo ocurrir el error
                                           e.printStackTrace();
                                       }
                                   }
                               }
        );
    }
    public Calculadora() {
        //Titulo de la pestaña
        setTitle("Calculado");
        //Operacion por defecto al cerrar la ventana
        setDefaultCloseOperation(Calculadora.EXIT_ON_CLOSE);
        //Dimensiona la ventana
        //setBounds(x, y, ancho, alto);
        setBounds(100, 100, 430, 411);
        contentPane = new JPanel();
        contentPane.setToolTipText("");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        txtPantalla = new JTextField();

        txtPantalla.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (txtPantalla.getText().equals("")) {
                    txtPantalla.setText("0");

                }
            }

            @Override
            public void focusLost(FocusEvent event) {
                if (txtPantalla.getText().equals("0")) {
                    txtPantalla.setText("");
                }
            }
        });

        txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 22));
        txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        //setBounds indica (x,y,ancho,alto)
        txtPantalla.setBounds(51, 38, 320, 56);
        contentPane.add(txtPantalla);
        txtPantalla.setColumns(10);


        //creamos el boton limpiar pantalla
        JButton btnLimpiar = new JButton("C");
        btnLimpiar.addActionListener(new ActionListener() {
                                         //creamos el metodo para limpiar la pantalla
                                         public void actionPerformed(ActionEvent e) {
                                             txtPantalla.setText("");
                                         }
                                     }
        );
        //setBounds indica (x,y,ancho,alto)
        btnLimpiar.setBounds(51, 104, 122, 39);
        contentPane.add(btnLimpiar);

        //creamos el boton 7
        JButton btnSiete = new JButton("7");
        btnSiete.addActionListener(new ActionListener() {
                                       //creamos el metodo para limpiar la pantalla
                                       public void actionPerformed(ActionEvent e) {
                                           txtPantalla.setText(txtPantalla.getText() + "7");
                                       }
                                   }
        );
        //setBounds indica (x,y,ancho,alto)
        btnSiete.setBounds(51, 153, 56, 39);
        contentPane.add(btnSiete);


        //creamos el boton limpiar pantalla
        JButton btnLimpiar2 = new JButton("CE");
        btnLimpiar2.addActionListener(new ActionListener() {
            //creamos el metodo para limpiar la pantalla
            public void actionPerformed(ActionEvent e) {
                String cadena;
                cadena = txtPantalla.getText();
                if (cadena.length() > 0) {
                    cadena = cadena.substring(0, cadena.length() - 1);
                    txtPantalla.setText(cadena);
                }
            }
        });

        //setBounds indica (x,y,ancho,alto)
        btnLimpiar2.setBounds(315, 104, 56, 39);
        contentPane.add(btnLimpiar2);

        //creamos el boton 8 pantalla
        JButton btnOcho = new JButton("8");
        btnOcho.addActionListener(new ActionListener() {
                                      //creamos el metodo para limpiar la pantalla
                                      public void actionPerformed(ActionEvent e) {
                                          txtPantalla.setText(txtPantalla.getText() + "8");
                                      }
                                  }
        );
        //setBounds indica (x,y,ancho,alto)
        btnOcho.setBounds(117, 153, 56, 39);
        contentPane.add(btnOcho);

        //creamos el boton 4 pantalla
        JButton btnCuatro = new JButton("4");
        btnCuatro.addActionListener(new ActionListener() {
                                        //creamos el metodo para limpiar la pantalla
                                        public void actionPerformed(ActionEvent e) {
                                            txtPantalla.setText(txtPantalla.getText() + "4");
                                        }
                                    }
        );
        //setBounds indica (x,y,ancho,alto)
        btnCuatro.setBounds(51, 202, 56, 39);
        contentPane.add(btnCuatro);


        //creamos el boton 5 pantalla
        JButton btnCinco = new JButton("5");
        btnCinco.addActionListener(new ActionListener() {
                                       //creamos el metodo para limpiar la pantalla
                                       public void actionPerformed(ActionEvent e) {
                                           txtPantalla.setText(txtPantalla.getText() + "5");
                                       }
                                   }
        );
        //setBounds indica (x,y,ancho,alto)
        btnCinco.setBounds(117, 202, 56, 39);
        contentPane.add(btnCinco);


        //creamos el boton 6 pantalla
        JButton btnSeis = new JButton("6");
        btnSeis.addActionListener(new ActionListener() {
                                      //creamos el metodo para limpiar la pantalla
                                      public void actionPerformed(ActionEvent e) {
                                          txtPantalla.setText(txtPantalla.getText() + "6");
                                      }
                                  }
        );
        //setBounds indica (x,y,ancho,alto)
        btnSeis.setBounds(183, 202, 56, 39);
        contentPane.add(btnSeis);


        //creamos el boton 9 pantalla
        JButton btnnueve = new JButton("9");
        btnnueve.addActionListener(new ActionListener() {
                                       //creamos el metodo para limpiar la pantalla
                                       public void actionPerformed(ActionEvent e) {
                                           txtPantalla.setText(txtPantalla.getText() + "9");
                                       }
                                   }
        );
        //setBounds indica (x,y,ancho,alto)
        btnnueve.setBounds(183, 153, 56, 39);
        contentPane.add(btnnueve);

//

        //creamos el boton 3 pantalla
        JButton btntres = new JButton("3");
        btntres.addActionListener(new ActionListener() {
                                      //creamos el metodo para limpiar la pantalla
                                      public void actionPerformed(ActionEvent e) {
                                          txtPantalla.setText(txtPantalla.getText() + "3");
                                      }
                                  }
        );
        //setBounds indica (x,y,ancho,alto)
        btntres.setBounds(51, 251, 56, 39);
        contentPane.add(btntres);


        //creamos el boton 2 pantalla
        JButton btndos = new JButton("2");
        btndos.addActionListener(new ActionListener() {
                                     //creamos el metodo para limpiar la pantalla
                                     public void actionPerformed(ActionEvent e) {
                                         txtPantalla.setText(txtPantalla.getText() + "2");
                                     }
                                 }
        );
        //setBounds indica (x,y,ancho,alto)
        btndos.setBounds(117, 251, 56, 39);
        contentPane.add(btndos);


        //creamos el boton 1 pantalla
        JButton btnUno = new JButton("1");
        btnUno.addActionListener(new ActionListener() {
                                     //creamos el metodo para limpiar la pantalla
                                     public void actionPerformed(ActionEvent e) {
                                         txtPantalla.setText(txtPantalla.getText() + "1");
                                     }
                                 }
        );
        //setBounds indica (x,y,ancho,alto)
        btnUno.setBounds(183, 251, 56, 39);
        contentPane.add(btnUno);

//
        //creamos el boton resta -
        JButton btnRestar = new JButton("-");
        btnRestar.addActionListener(new ActionListener() {
            //creamos el metodo para limpiar la pantalla
            public void actionPerformed(ActionEvent e) {
                if (!txtPantalla.getText().equals("")) {
                    memoria1 = txtPantalla.getText();
                    signo = "-";
                    txtPantalla.setText("");
                }
            }
        });
        //setBounds indica (x,y,ancho,alto)
        btnRestar.setBounds(183, 104, 56, 39);
        contentPane.add(btnRestar);


        //creamos el boton 0 pantalla
        JButton btnCero = new JButton("0");
        btnCero.addActionListener(new ActionListener() {
                                      //creamos el metodo para limpiar la pantalla
                                      public void actionPerformed(ActionEvent e) {
                                          txtPantalla.setText(txtPantalla.getText() + "0");
                                      }
                                  }
        );
        //setBounds indica (x,y,ancho,alto)
        btnCero.setBounds(51, 300, 188, 39);
        contentPane.add(btnCero);


        //creamos el boton limpiar pantalla
        JButton btnDividir = new JButton("/");
        btnDividir.addActionListener(new ActionListener() {
            //creamos el metodo para limpiar la pantalla
            public void actionPerformed(ActionEvent e) {
                if (!txtPantalla.getText().equals("")) {
                    memoria1 = txtPantalla.getText();
                    signo = "/";
                    txtPantalla.setText("");
                }
            }
        });
        //setBounds indica (x,y,ancho,alto)
        btnDividir.setBounds(249, 104, 56, 39);
        contentPane.add(btnDividir);


        //creamos el boton limpiar pantalla
        JButton btnMultiplicar = new JButton("x");
        btnMultiplicar.addActionListener(new ActionListener() {
            //creamos el metodo para limpiar la pantalla
            public void actionPerformed(ActionEvent e) {
                if (!txtPantalla.getText().equals("")) {
                    memoria1 = txtPantalla.getText();
                    signo = "x";
                    txtPantalla.setText("");
                }
            }
        });
        //setBounds indica (x,y,ancho,alto)
        btnMultiplicar.setBounds(249, 153, 56, 88);
        contentPane.add(btnMultiplicar);


        //creamos el boton limpiar pantalla
        JButton btnSumar = new JButton("+");
        btnSumar.addActionListener(new ActionListener() {
            //creamos el metodo para limpiar la pantalla
            public void actionPerformed(ActionEvent e) {
                if (!txtPantalla.getText().equals("")) {
                    memoria1 = txtPantalla.getText();
                    signo = "+";
                    txtPantalla.setText("");
                }
            }
        });
        //setBounds indica (x,y,ancho,alto)
        btnSumar.setBounds(315, 153, 56, 88);
        contentPane.add(btnSumar);


        //creamos el boton limpiar pantalla
        JButton btnIgual = new JButton("=");
        btnIgual.addActionListener(new ActionListener() {
            //creamos el metodo para limpiar la pantalla
            public void actionPerformed(ActionEvent e) {
                String resultado;
                memoria2 = txtPantalla.getText();
                if (!memoria2.equals("")) {
                    resultado = calculadora(memoria1, memoria2, signo);
                    txtPantalla.setText(resultado);
                }

            }

            public static String calculadora(String memoria1, String memoria2, String signo) {
                Double resultado = 0.0;
                String respuesta;
                if (signo.equals("-")) {
                    resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
                }
                if (signo.equals("+")) {
                    resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);
                }
                if (signo.equals("x")) {
                    resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);
                }
                if (signo.equals("/")) {
                    resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);
                }
                respuesta = resultado.toString();
                return respuesta;
            }
        });
        //setBounds indica (x,y,ancho,alto)
        btnIgual.setBounds(249, 251, 122, 88);
        contentPane.add(btnIgual);


    }}