package practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.DataBuffer;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import java.awt.image.WritableRaster;
import java.beans.PropertyVetoException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sm.image.KernelProducer;
import sm.image.LookupTableProducer;
import sm.image.color.GreyColorSpace;
import sm.ko.graficos.TipoForma;
import sm.ko.imagen.SepiaOp;
import sm.ko.sonido.ManejadorAudio;
import sm.ko.sonido.ManejadorGrabador;
import sm.ko.ui.Lienzo2D;
import sm.sound.SMRecorder;
import sm.sound.SMSoundPlayer;
import sm.sound.SMSoundRecorder;
import sm.ko.ui.ComboBoxRenderer;
/**
 *
 * @author Kudry
 */
public class Frame extends javax.swing.JFrame {
           
    private BufferedImage imgSource;
    
    private SMSoundPlayer player = null;
    private SMRecorder recorder = null;
    private File recordedFile = null;

    
    public Frame() {            
        this.setLayout(new BorderLayout());     
                        
        initComponents();
        this.setVisible(true);
        this.setTitle("Paint v2");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(1000,500);
        this.setLocation(screenSize.width/2-this.getWidth()/2, screenSize.height/2-this.getHeight()/2);   
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        panelHerramientas = new javax.swing.JPanel();
        panelArchivo = new javax.swing.JPanel();
        botonNuevo = new javax.swing.JButton();
        botonAbrir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonDuplicar = new javax.swing.JButton();
        panelCamara = new javax.swing.JPanel();
        botonCamara = new javax.swing.JButton();
        botonCapturar = new javax.swing.JButton();
        panelImagen = new javax.swing.JPanel();
        botonLibre = new javax.swing.JToggleButton();
        botonLapiz = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonCurva = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonElipse = new javax.swing.JToggleButton();
        botonSemicirculo = new javax.swing.JToggleButton();
        botonEditar = new javax.swing.JToggleButton();
        comboBoxColores = new javax.swing.JComboBox<>();
        comboBoxColores.addItem(Color.white);
        comboBoxColores.addItem(Color.red);
        comboBoxColores.addItem(Color.blue);
        comboBoxColores.addItem(Color.green);
        comboBoxColores.addItem(Color.yellow);
        comboBoxColores.addItem(Color.black);
        comboBoxColores.setSelectedIndex(5);
        grosor = new javax.swing.JSpinner();
        botonRelleno = new javax.swing.JToggleButton();
        botonTransparencia = new javax.swing.JToggleButton();
        botonAlisado = new javax.swing.JToggleButton();
        panelHerramientas2 = new javax.swing.JPanel();
        herramientasImagen = new javax.swing.JPanel();
        panelBrillo = new javax.swing.JPanel();
        sliderBrillo = new javax.swing.JSlider();
        panelFiltro = new javax.swing.JPanel();
        comboBoxFiltros = new javax.swing.JComboBox<>();
        panelContraste = new javax.swing.JPanel();
        botonContraste = new javax.swing.JButton();
        botonIluminar = new javax.swing.JButton();
        botonOscurecer = new javax.swing.JButton();
        panelSinusoidal = new javax.swing.JPanel();
        botonSinusoidal = new javax.swing.JButton();
        botonSepia = new javax.swing.JButton();
        panelColor = new javax.swing.JPanel();
        botonBandas = new javax.swing.JButton();
        comboBoxEspacioColores = new javax.swing.JComboBox<>();
        panelRotacion = new javax.swing.JPanel();
        sliderRotar = new javax.swing.JSlider();
        botonRotar90 = new javax.swing.JButton();
        botonRotar180 = new javax.swing.JButton();
        botonRotar275 = new javax.swing.JButton();
        panelEscala = new javax.swing.JPanel();
        botonAumentar = new javax.swing.JButton();
        BotonDisminuir = new javax.swing.JButton();
        herramientasSonido = new javax.swing.JPanel();
        botonPlay = new javax.swing.JButton();
        botonPause = new javax.swing.JButton();
        comboBoxListaReproduccion = new javax.swing.JComboBox<>();
        botonRecord = new javax.swing.JButton();
        labelTiempoGrabacion = new java.awt.Label();
        barraDeEstado = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        botonArchivoNuevo = new javax.swing.JMenuItem();
        botonArchivoAbrir = new javax.swing.JMenuItem();
        botonArchivoGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuArchivoImprimir = new javax.swing.JMenu();
        botonArchivoImprimirImpresora = new javax.swing.JMenuItem();
        botonArchivoImprimirFichero = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        botonEditarCopiar = new javax.swing.JMenuItem();
        botonEditarCortar = new javax.swing.JMenuItem();
        botonEditarPegar = new javax.swing.JMenuItem();
        MenuImagen = new javax.swing.JMenu();
        botonImagenRescaleOp = new javax.swing.JMenuItem();
        botonImagenConvolveOp = new javax.swing.JMenuItem();
        botonImagenAffineTransformOp = new javax.swing.JMenuItem();
        botonImagenLookupOp = new javax.swing.JMenuItem();
        botonImagenBandCombineOp = new javax.swing.JMenuItem();
        botonImagenColorConvertOp = new javax.swing.JMenuItem();
        MenuVer = new javax.swing.JMenu();
        checkboxVerBarraDeEstado = new javax.swing.JCheckBoxMenuItem();
        checkboxVerBarraImagen = new javax.swing.JCheckBoxMenuItem();
        checkboxVerBarraAudio = new javax.swing.JCheckBoxMenuItem();
        MenuFigura = new javax.swing.JMenu();
        botonFiguraEnviarFondo = new javax.swing.JMenuItem();
        botonFiguraTraerFrente = new javax.swing.JMenuItem();
        botonFiguraEnviarAtras = new javax.swing.JMenuItem();
        botonFiguraTraerAdelante = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        botonAyudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 2000));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        panelHerramientas.setBackground(java.awt.Color.lightGray);
        panelHerramientas.setMaximumSize(new java.awt.Dimension(32769, 41));
        panelHerramientas.setLayout(new javax.swing.BoxLayout(panelHerramientas, javax.swing.BoxLayout.LINE_AXIS));

        panelArchivo.setBackground(java.awt.Color.lightGray);
        panelArchivo.setLayout(new javax.swing.BoxLayout(panelArchivo, javax.swing.BoxLayout.LINE_AXIS));

        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/nuevo.png"))); // NOI18N
        botonNuevo.setToolTipText("Lienzo nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });
        panelArchivo.add(botonNuevo);

        botonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/abrir.png"))); // NOI18N
        botonAbrir.setToolTipText("Abrir lienzo");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });
        panelArchivo.add(botonAbrir);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/guardar.png"))); // NOI18N
        botonGuardar.setToolTipText("Guardar lienzo");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panelArchivo.add(botonGuardar);

        botonDuplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/duplicar.png"))); // NOI18N
        botonDuplicar.setToolTipText("Duplicar imagen");
        botonDuplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDuplicarActionPerformed(evt);
            }
        });
        panelArchivo.add(botonDuplicar);

        panelHerramientas.add(panelArchivo);

        panelCamara.setLayout(new javax.swing.BoxLayout(panelCamara, javax.swing.BoxLayout.LINE_AXIS));

        botonCamara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/iconosPracticaVideo/Camara.png"))); // NOI18N
        botonCamara.setToolTipText("Activar camara");
        botonCamara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCamaraActionPerformed(evt);
            }
        });
        panelCamara.add(botonCamara);

        botonCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/iconosPracticaVideo/Capturar.png"))); // NOI18N
        botonCapturar.setToolTipText("Hacer captura");
        botonCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCapturarActionPerformed(evt);
            }
        });
        panelCamara.add(botonCapturar);

        panelHerramientas.add(panelCamara);

        panelImagen.setBackground(java.awt.Color.lightGray);
        panelImagen.setLayout(new javax.swing.BoxLayout(panelImagen, javax.swing.BoxLayout.LINE_AXIS));

        botonLibre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/libre.png"))); // NOI18N
        botonLibre.setToolTipText("Trazo libre");
        botonLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLibreActionPerformed(evt);
            }
        });
        panelImagen.add(botonLibre);

        botonLapiz.setBackground(java.awt.Color.lightGray);
        botonLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/punto.png"))); // NOI18N
        botonLapiz.setToolTipText("Punto");
        botonLapiz.setBorderPainted(false);
        botonLapiz.setFocusable(false);
        botonLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLapizActionPerformed(evt);
            }
        });
        panelImagen.add(botonLapiz);

        botonLinea.setBackground(java.awt.Color.lightGray);
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/linea.png"))); // NOI18N
        botonLinea.setToolTipText("Linea");
        botonLinea.setBorderPainted(false);
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLineaActionPerformed(evt);
            }
        });
        panelImagen.add(botonLinea);

        botonCurva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/curva.png"))); // NOI18N
        botonCurva.setToolTipText("Curva con un punto de control");
        botonCurva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurvaActionPerformed(evt);
            }
        });
        panelImagen.add(botonCurva);

        botonRectangulo.setBackground(java.awt.Color.lightGray);
        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/rectangulo.png"))); // NOI18N
        botonRectangulo.setToolTipText("Rectangulo");
        botonRectangulo.setBorderPainted(false);
        botonRectangulo.setFocusable(false);
        botonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloActionPerformed(evt);
            }
        });
        panelImagen.add(botonRectangulo);

        botonElipse.setBackground(java.awt.Color.lightGray);
        botonElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/elipse.png"))); // NOI18N
        botonElipse.setToolTipText("Elipse");
        botonElipse.setBorderPainted(false);
        botonElipse.setFocusable(false);
        botonElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElipseActionPerformed(evt);
            }
        });
        panelImagen.add(botonElipse);

        botonSemicirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/arco.png"))); // NOI18N
        botonSemicirculo.setToolTipText("Semicirculo");
        botonSemicirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSemicirculoActionPerformed(evt);
            }
        });
        panelImagen.add(botonSemicirculo);

        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/seleccion.png"))); // NOI18N
        botonEditar.setToolTipText("Mover formas");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        panelImagen.add(botonEditar);

        comboBoxColores.setToolTipText("Selector colores");
        comboBoxColores.setMaximumSize(new java.awt.Dimension(60, 35));
        comboBoxColores.setMinimumSize(new java.awt.Dimension(1, 1));
        comboBoxColores.setPreferredSize(new java.awt.Dimension(60, 35));
        comboBoxColores.setRenderer(new ComboBoxRenderer());
        comboBoxColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxColoresActionPerformed(evt);
            }
        });
        panelImagen.add(comboBoxColores);

        grosor.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        grosor.setToolTipText("Grosor");
        grosor.setMaximumSize(new java.awt.Dimension(45, 30));
        grosor.setMinimumSize(new java.awt.Dimension(45, 30));
        grosor.setPreferredSize(new java.awt.Dimension(45, 30));
        grosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                grosorStateChanged(evt);
            }
        });
        panelImagen.add(grosor);

        botonRelleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/rellenar.png"))); // NOI18N
        botonRelleno.setToolTipText("Rellenar");
        botonRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRellenoActionPerformed(evt);
            }
        });
        panelImagen.add(botonRelleno);

        botonTransparencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/transparencia.png"))); // NOI18N
        botonTransparencia.setToolTipText("Transparencia");
        botonTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransparenciaActionPerformed(evt);
            }
        });
        panelImagen.add(botonTransparencia);

        botonAlisado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/alisar.png"))); // NOI18N
        botonAlisado.setToolTipText("Alisado");
        botonAlisado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlisadoActionPerformed(evt);
            }
        });
        panelImagen.add(botonAlisado);

        panelHerramientas.add(panelImagen);

        getContentPane().add(panelHerramientas, java.awt.BorderLayout.NORTH);

        panelHerramientas2.setBackground(java.awt.Color.lightGray);
        panelHerramientas2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHerramientas2.setLayout(new java.awt.BorderLayout());

        herramientasImagen.setMaximumSize(new java.awt.Dimension(805, 80));
        herramientasImagen.setMinimumSize(new java.awt.Dimension(741, 80));
        herramientasImagen.setPreferredSize(new java.awt.Dimension(718, 80));
        herramientasImagen.setLayout(new javax.swing.BoxLayout(herramientasImagen, javax.swing.BoxLayout.LINE_AXIS));

        panelBrillo.setBorder(javax.swing.BorderFactory.createTitledBorder("Brillo"));
        panelBrillo.setMaximumSize(new java.awt.Dimension(160, 65));
        panelBrillo.setMinimumSize(new java.awt.Dimension(160, 65));
        panelBrillo.setPreferredSize(new java.awt.Dimension(160, 65));

        sliderBrillo.setMaximum(255);
        sliderBrillo.setMinimum(-255);
        sliderBrillo.setToolTipText("Modificar brillo");
        sliderBrillo.setValue(0);
        sliderBrillo.setMaximumSize(new java.awt.Dimension(80, 25));
        sliderBrillo.setMinimumSize(new java.awt.Dimension(80, 25));
        sliderBrillo.setPreferredSize(new java.awt.Dimension(80, 25));
        sliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBrilloStateChanged(evt);
            }
        });
        sliderBrillo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderBrilloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderBrilloFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelBrilloLayout = new javax.swing.GroupLayout(panelBrillo);
        panelBrillo.setLayout(panelBrilloLayout);
        panelBrilloLayout.setHorizontalGroup(
            panelBrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBrilloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliderBrillo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(578, 578, 578))
        );
        panelBrilloLayout.setVerticalGroup(
            panelBrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrilloLayout.createSequentialGroup()
                .addComponent(sliderBrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        herramientasImagen.add(panelBrillo);

        panelFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));
        panelFiltro.setMaximumSize(new java.awt.Dimension(150, 65));
        panelFiltro.setMinimumSize(new java.awt.Dimension(150, 65));
        panelFiltro.setPreferredSize(new java.awt.Dimension(150, 65));

        comboBoxFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media", "Binomial", "Enfoque", "Relieve", "Laplaciano", " " }));
        comboBoxFiltros.setToolTipText("Aplicar filtro ");
        comboBoxFiltros.setMaximumSize(new java.awt.Dimension(150, 32767));
        comboBoxFiltros.setMinimumSize(new java.awt.Dimension(150, 20));
        comboBoxFiltros.setPreferredSize(new java.awt.Dimension(150, 20));
        comboBoxFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFiltroLayout = new javax.swing.GroupLayout(panelFiltro);
        panelFiltro.setLayout(panelFiltroLayout);
        panelFiltroLayout.setHorizontalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxFiltros, 0, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFiltroLayout.setVerticalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addComponent(comboBoxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        herramientasImagen.add(panelFiltro);

        panelContraste.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraste"));
        panelContraste.setLayout(new javax.swing.BoxLayout(panelContraste, javax.swing.BoxLayout.LINE_AXIS));

        botonContraste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/contraste.png"))); // NOI18N
        botonContraste.setToolTipText("Boton contraste");
        botonContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContrasteActionPerformed(evt);
            }
        });
        panelContraste.add(botonContraste);

        botonIluminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/iluminar.png"))); // NOI18N
        botonIluminar.setToolTipText("Iluminar");
        botonIluminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIluminarActionPerformed(evt);
            }
        });
        panelContraste.add(botonIluminar);

        botonOscurecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/oscurecer.png"))); // NOI18N
        botonOscurecer.setToolTipText("Oscurecer");
        botonOscurecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOscurecerActionPerformed(evt);
            }
        });
        panelContraste.add(botonOscurecer);

        herramientasImagen.add(panelContraste);

        panelSinusoidal.setBorder(javax.swing.BorderFactory.createTitledBorder("   "));
        panelSinusoidal.setPreferredSize(new java.awt.Dimension(80, 48));
        panelSinusoidal.setLayout(new javax.swing.BoxLayout(panelSinusoidal, javax.swing.BoxLayout.LINE_AXIS));

        botonSinusoidal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/sinusoidal.png"))); // NOI18N
        botonSinusoidal.setToolTipText("Operador sinusoidal");
        botonSinusoidal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSinusoidalActionPerformed(evt);
            }
        });
        panelSinusoidal.add(botonSinusoidal);

        botonSepia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/sepia.png"))); // NOI18N
        botonSepia.setToolTipText("Operador sepia");
        botonSepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSepiaActionPerformed(evt);
            }
        });
        panelSinusoidal.add(botonSepia);

        herramientasImagen.add(panelSinusoidal);

        panelColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Color"));
        panelColor.setLayout(new javax.swing.BoxLayout(panelColor, javax.swing.BoxLayout.LINE_AXIS));

        botonBandas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/bandas.png"))); // NOI18N
        botonBandas.setToolTipText("Extraer bandas de colores");
        botonBandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBandasActionPerformed(evt);
            }
        });
        panelColor.add(botonBandas);

        comboBoxEspacioColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RGB", "YCC", "GREY" }));
        comboBoxEspacioColores.setToolTipText("Cambiar espacio de colores");
        comboBoxEspacioColores.setMaximumSize(new java.awt.Dimension(60, 20));
        comboBoxEspacioColores.setMinimumSize(new java.awt.Dimension(60, 20));
        comboBoxEspacioColores.setPreferredSize(new java.awt.Dimension(60, 20));
        comboBoxEspacioColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEspacioColoresActionPerformed(evt);
            }
        });
        panelColor.add(comboBoxEspacioColores);

        herramientasImagen.add(panelColor);

        panelRotacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Rotación"));
        panelRotacion.setLayout(new javax.swing.BoxLayout(panelRotacion, javax.swing.BoxLayout.LINE_AXIS));

        sliderRotar.setMaximum(360);
        sliderRotar.setToolTipText("Rotar imagen");
        sliderRotar.setValue(0);
        sliderRotar.setMaximumSize(new java.awt.Dimension(100, 26));
        sliderRotar.setMinimumSize(new java.awt.Dimension(100, 26));
        sliderRotar.setPreferredSize(new java.awt.Dimension(100, 26));
        sliderRotar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRotarStateChanged(evt);
            }
        });
        sliderRotar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderRotarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderRotarFocusLost(evt);
            }
        });
        panelRotacion.add(sliderRotar);

        botonRotar90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/rotacion90.png"))); // NOI18N
        botonRotar90.setToolTipText("Rotar 90 grados");
        botonRotar90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRotar90ActionPerformed(evt);
            }
        });
        panelRotacion.add(botonRotar90);

        botonRotar180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/rotacion180.png"))); // NOI18N
        botonRotar180.setToolTipText("Rotar180 grados");
        botonRotar180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRotar180ActionPerformed(evt);
            }
        });
        panelRotacion.add(botonRotar180);

        botonRotar275.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/rotacion270.png"))); // NOI18N
        botonRotar275.setToolTipText("Rotar 270 grados");
        botonRotar275.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRotar275ActionPerformed(evt);
            }
        });
        panelRotacion.add(botonRotar275);

        herramientasImagen.add(panelRotacion);

        panelEscala.setBorder(javax.swing.BorderFactory.createTitledBorder("Escala"));
        panelEscala.setLayout(new javax.swing.BoxLayout(panelEscala, javax.swing.BoxLayout.LINE_AXIS));

        botonAumentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/aumentar.png"))); // NOI18N
        botonAumentar.setToolTipText("Aumentar");
        botonAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAumentarActionPerformed(evt);
            }
        });
        panelEscala.add(botonAumentar);

        BotonDisminuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/disminuir.png"))); // NOI18N
        BotonDisminuir.setToolTipText("Disminuir");
        BotonDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDisminuirActionPerformed(evt);
            }
        });
        panelEscala.add(BotonDisminuir);

        herramientasImagen.add(panelEscala);

        panelHerramientas2.add(herramientasImagen, java.awt.BorderLayout.NORTH);

        herramientasSonido.setLayout(new javax.swing.BoxLayout(herramientasSonido, javax.swing.BoxLayout.LINE_AXIS));

        botonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/play24x24.png"))); // NOI18N
        botonPlay.setToolTipText("Reproducir audio");
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });
        herramientasSonido.add(botonPlay);

        botonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/pausa24x24.png"))); // NOI18N
        botonPause.setToolTipText("Detener audio");
        botonPause.setEnabled(false);
        botonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPauseActionPerformed(evt);
            }
        });
        herramientasSonido.add(botonPause);

        comboBoxListaReproduccion.setToolTipText("Selector audios");
        comboBoxListaReproduccion.setMaximumSize(new java.awt.Dimension(200, 32767));
        herramientasSonido.add(comboBoxListaReproduccion);

        botonRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica/res/record24x24.png"))); // NOI18N
        botonRecord.setToolTipText("Grabar audio");
        botonRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecordActionPerformed(evt);
            }
        });
        herramientasSonido.add(botonRecord);

        labelTiempoGrabacion.setMaximumSize(new java.awt.Dimension(50, 32767));
        labelTiempoGrabacion.setText("00:00");
        herramientasSonido.add(labelTiempoGrabacion);

        panelHerramientas2.add(herramientasSonido, java.awt.BorderLayout.CENTER);

        barraDeEstado.setText("herramienta seleccionada");
        barraDeEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHerramientas2.add(barraDeEstado, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panelHerramientas2, java.awt.BorderLayout.SOUTH);

        MenuArchivo.setText("Archivo");

        botonArchivoNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        botonArchivoNuevo.setText("Nuevo");
        botonArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(botonArchivoNuevo);

        botonArchivoAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        botonArchivoAbrir.setText("Abrir");
        botonArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(botonArchivoAbrir);

        botonArchivoGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        botonArchivoGuardar.setText("Guardar");
        botonArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(botonArchivoGuardar);
        MenuArchivo.add(jSeparator1);

        MenuArchivoImprimir.setText("Imprimir");

        botonArchivoImprimirImpresora.setText("Impresora");
        botonArchivoImprimirImpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoImprimirImpresoraActionPerformed(evt);
            }
        });
        MenuArchivoImprimir.add(botonArchivoImprimirImpresora);

        botonArchivoImprimirFichero.setText("Fichero");
        botonArchivoImprimirFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoImprimirFicheroActionPerformed(evt);
            }
        });
        MenuArchivoImprimir.add(botonArchivoImprimirFichero);

        MenuArchivo.add(MenuArchivoImprimir);

        BarraMenu.add(MenuArchivo);

        MenuEditar.setText("Editar");

        botonEditarCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        botonEditarCopiar.setText("Copiar");
        botonEditarCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarCopiarActionPerformed(evt);
            }
        });
        MenuEditar.add(botonEditarCopiar);

        botonEditarCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        botonEditarCortar.setText("Cortar");
        botonEditarCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarCortarActionPerformed(evt);
            }
        });
        MenuEditar.add(botonEditarCortar);

        botonEditarPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        botonEditarPegar.setText("Pegar");
        botonEditarPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarPegarActionPerformed(evt);
            }
        });
        MenuEditar.add(botonEditarPegar);

        BarraMenu.add(MenuEditar);

        MenuImagen.setText("Imagen");

        botonImagenRescaleOp.setText("RescaleOp");
        botonImagenRescaleOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenRescaleOpActionPerformed(evt);
            }
        });
        MenuImagen.add(botonImagenRescaleOp);

        botonImagenConvolveOp.setText("ConvolveOp");
        botonImagenConvolveOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenConvolveOpActionPerformed(evt);
            }
        });
        MenuImagen.add(botonImagenConvolveOp);

        botonImagenAffineTransformOp.setText("AffineTransformOp");
        botonImagenAffineTransformOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenAffineTransformOpActionPerformed(evt);
            }
        });
        MenuImagen.add(botonImagenAffineTransformOp);

        botonImagenLookupOp.setText("LookupOp");
        botonImagenLookupOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenLookupOpActionPerformed(evt);
            }
        });
        MenuImagen.add(botonImagenLookupOp);

        botonImagenBandCombineOp.setText("BandCombineOp");
        botonImagenBandCombineOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenBandCombineOpActionPerformed(evt);
            }
        });
        MenuImagen.add(botonImagenBandCombineOp);

        botonImagenColorConvertOp.setText("ColorConvertOp");
        botonImagenColorConvertOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenColorConvertOpActionPerformed(evt);
            }
        });
        MenuImagen.add(botonImagenColorConvertOp);

        BarraMenu.add(MenuImagen);

        MenuVer.setText("Ver");

        checkboxVerBarraDeEstado.setSelected(true);
        checkboxVerBarraDeEstado.setText("Barra de estado");
        checkboxVerBarraDeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxVerBarraDeEstadoActionPerformed(evt);
            }
        });
        MenuVer.add(checkboxVerBarraDeEstado);

        checkboxVerBarraImagen.setSelected(true);
        checkboxVerBarraImagen.setText("Barra efectos de imagen");
        checkboxVerBarraImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxVerBarraImagenActionPerformed(evt);
            }
        });
        MenuVer.add(checkboxVerBarraImagen);

        checkboxVerBarraAudio.setSelected(true);
        checkboxVerBarraAudio.setText("Barra audio");
        checkboxVerBarraAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxVerBarraAudioActionPerformed(evt);
            }
        });
        MenuVer.add(checkboxVerBarraAudio);

        BarraMenu.add(MenuVer);

        MenuFigura.setText("Figura");

        botonFiguraEnviarFondo.setText("Enviar al fondo");
        botonFiguraEnviarFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiguraEnviarFondoActionPerformed(evt);
            }
        });
        MenuFigura.add(botonFiguraEnviarFondo);

        botonFiguraTraerFrente.setText("Traer al frente");
        botonFiguraTraerFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiguraTraerFrenteActionPerformed(evt);
            }
        });
        MenuFigura.add(botonFiguraTraerFrente);

        botonFiguraEnviarAtras.setText("Enviar atras");
        botonFiguraEnviarAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiguraEnviarAtrasActionPerformed(evt);
            }
        });
        MenuFigura.add(botonFiguraEnviarAtras);

        botonFiguraTraerAdelante.setText("Traer adelante");
        botonFiguraTraerAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiguraTraerAdelanteActionPerformed(evt);
            }
        });
        MenuFigura.add(botonFiguraTraerAdelante);

        BarraMenu.add(MenuFigura);

        MenuAyuda.setText("Ayuda");

        botonAyudaAcercaDe.setText("Acerca de");
        botonAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaAcercaDeActionPerformed(evt);
            }
        });
        MenuAyuda.add(botonAyudaAcercaDe);

        BarraMenu.add(MenuAyuda);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
        MENU ARCHIVO
    */
    private void botonArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoNuevoActionPerformed
        lienzoNuevo();
    }//GEN-LAST:event_botonArchivoNuevoActionPerformed

    private void botonArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoAbrirActionPerformed
        abrirFichero(); 
    }//GEN-LAST:event_botonArchivoAbrirActionPerformed

    private void botonArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoGuardarActionPerformed
        guardarFichero();       
    }//GEN-LAST:event_botonArchivoGuardarActionPerformed

    private void botonArchivoImprimirImpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoImprimirImpresoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonArchivoImprimirImpresoraActionPerformed

    private void botonArchivoImprimirFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoImprimirFicheroActionPerformed
        guardarFichero();
    }//GEN-LAST:event_botonArchivoImprimirFicheroActionPerformed

    /*
        MENU EDITAR
    */
    private void botonEditarCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarCopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEditarCopiarActionPerformed

    private void botonEditarCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarCortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEditarCortarActionPerformed

    private void botonEditarPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarPegarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEditarPegarActionPerformed

    /*
        MENU IMAGEN
    */
    /**
     * Realiza la operacion rescale sobre la imagen de la ventana interna seleccionada
     * @param evt 
     */
    private void botonImagenRescaleOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenRescaleOpActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            BufferedImage img = vi.getLienzo().getImage();
            try{
                RescaleOp rop = new RescaleOp(0.5f, 100.0f, null);
                rop.filter(img, img);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println("Error rescale op");
            }
        }
    }//GEN-LAST:event_botonImagenRescaleOpActionPerformed

    /**
     * Realiza la operacion convolve sobre la imagen de la ventana interna seleccionada
     * @param evt 
     */
    private void botonImagenConvolveOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenConvolveOpActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            
            try{
                Kernel kernel = KernelProducer.createKernel(KernelProducer.TYPE_MEDIA_3x3);
                ConvolveOp cop = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
                BufferedImage img = cop.filter(vi.getLienzo().getImage(), null);
                vi.getLienzo().setImage(img);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println("Error rescale op");
            }
            
        }
    }//GEN-LAST:event_botonImagenConvolveOpActionPerformed

    /**
     * Realiza la operacion affine transform sobre la imagen de la ventana interna seleccionada
     * @param evt 
     */
    private void botonImagenAffineTransformOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenAffineTransformOpActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            try{
                AffineTransform at = AffineTransform.getScaleInstance(1.25, 1.25);
                AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                BufferedImage image = atop.filter(vi.getLienzo().getImage(), null);
                vi.getLienzo().setImage(image);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println(e.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_botonImagenAffineTransformOpActionPerformed

    private void botonImagenLookupOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenLookupOpActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            try{
                LookupTable lt = LookupTableProducer.createLookupTable(LookupTableProducer.TYPE_SFUNCION);
                LookupOp lop = new LookupOp(lt,null);
                BufferedImage img = lop.filter(imgSource, null);
                vi.getLienzo().setImage(img);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println("Error lookup op");
            }
        }
    }//GEN-LAST:event_botonImagenLookupOpActionPerformed

    private void botonImagenBandCombineOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenBandCombineOpActionPerformed
        
    }//GEN-LAST:event_botonImagenBandCombineOpActionPerformed

    private void botonImagenColorConvertOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenColorConvertOpActionPerformed

    }//GEN-LAST:event_botonImagenColorConvertOpActionPerformed

    /*
        MENU VER
    */
    private void checkboxVerBarraDeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxVerBarraDeEstadoActionPerformed
        if(barraDeEstado.isVisible()){
            barraDeEstado.setVisible(false);
        }else{ 
            barraDeEstado.setVisible(true);
        }
    }//GEN-LAST:event_checkboxVerBarraDeEstadoActionPerformed

    private void checkboxVerBarraImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxVerBarraImagenActionPerformed
        if(herramientasImagen.isVisible()){
            herramientasImagen.setVisible(false);
        }else{ 
            herramientasImagen.setVisible(true);
        }
    }//GEN-LAST:event_checkboxVerBarraImagenActionPerformed

    private void checkboxVerBarraAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxVerBarraAudioActionPerformed
        if(herramientasSonido.isVisible()){
            herramientasSonido.setVisible(false);
        }else{ 
            herramientasSonido.setVisible(true);
        }
    }//GEN-LAST:event_checkboxVerBarraAudioActionPerformed

    /*
        MENU FIGURA
    */
    private void botonFiguraEnviarFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiguraEnviarFondoActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();

        if(vi != null && vi.getLienzo().getFormaActual() != null){
            vi.getLienzo().enviarAlFondo();
        }        
    }//GEN-LAST:event_botonFiguraEnviarFondoActionPerformed

    private void botonFiguraTraerFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiguraTraerFrenteActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();

        if(vi != null && vi.getLienzo().getFormaActual() != null){
            vi.getLienzo().traerAlFrente();
        }
    }//GEN-LAST:event_botonFiguraTraerFrenteActionPerformed

    private void botonFiguraTraerAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiguraTraerAdelanteActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();

        if(vi != null && vi.getLienzo().getFormaActual() != null){
            vi.getLienzo().traerAdelante();
        }
    }//GEN-LAST:event_botonFiguraTraerAdelanteActionPerformed

    private void botonFiguraEnviarAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiguraEnviarAtrasActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();

        if(vi != null && vi.getLienzo().getFormaActual() != null){
            vi.getLienzo().enviarAtras();
        }
    }//GEN-LAST:event_botonFiguraEnviarAtrasActionPerformed

    /*
        MENU AYUDA
    */
    private void botonAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaAcercaDeActionPerformed
        JOptionPane.showMessageDialog(null, "Paint v3 , Oleksandr Kudryavtsev");
    }//GEN-LAST:event_botonAyudaAcercaDeActionPerformed
    
    /*
    FIN BARRA DE HERRAMIENTAS
    */
    
    /*
        BOTONES FORMAS
    */
    private void botonLibreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.LIBRE);
            barraDeEstado.setText("Dibujado libre");

            restartBotonesFormas();
            botonLibre.setSelected(true);
            botonEditar.setSelected(false);
        }
    }                                              

    private void botonLapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLapizActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.PUNTO);
            barraDeEstado.setText("Lapiz");

            restartBotonesFormas();
            botonLapiz.setSelected(true);
            botonEditar.setSelected(false);
        }
    }//GEN-LAST:event_botonLapizActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.LINEA);
            barraDeEstado.setText("Linea");
            
            restartBotonesFormas();
            botonLinea.setSelected(true);
            botonEditar.setSelected(false);
        }
    }//GEN-LAST:event_botonLineaActionPerformed


    private void botonCurvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurvaActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.CURVA);    
            barraDeEstado.setText("Curva con un punto de control");
            
            restartBotonesFormas();
            botonCurva.setSelected(true);
            botonEditar.setSelected(false);
        }
    }//GEN-LAST:event_botonCurvaActionPerformed

    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.RECTANGULO);    
            barraDeEstado.setText("Rectangulo");
            
            restartBotonesFormas();
            botonRectangulo.setSelected(true);
            botonEditar.setSelected(false);
        }
    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElipseActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.ELIPSE);
            barraDeEstado.setText("Elipse");
            
            restartBotonesFormas();
            botonElipse.setSelected(true);
            botonEditar.setSelected(false);
        }
    }//GEN-LAST:event_botonElipseActionPerformed
    
    
    private void botonSemicirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSemicirculoActionPerformed
    VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setFormaDibujado(TipoForma.SEMICIRCULO);
            barraDeEstado.setText("Arco");
            
            restartBotonesFormas();
            botonSemicirculo.setSelected(true);
            botonEditar.setSelected(false);
        }
    }//GEN-LAST:event_botonSemicirculoActionPerformed

    
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        restartBotonesFormas();
        if(vi != null) 
            vi.getLienzo().updateEditar();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void comboBoxColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxColoresActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            vi.getLienzo().setColor((Color) comboBoxColores.getSelectedItem());
        }
    }//GEN-LAST:event_comboBoxColoresActionPerformed

    private void botonRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRellenoActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null)
            vi.getLienzo().updateRelleno();
    }//GEN-LAST:event_botonRellenoActionPerformed

    private void botonTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransparenciaActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null)
            vi.getLienzo().updateTransparencia();
    }//GEN-LAST:event_botonTransparenciaActionPerformed

    private void botonAlisadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlisadoActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null)
            vi.getLienzo().updateAlisado();
    }//GEN-LAST:event_botonAlisadoActionPerformed

    private void grosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_grosorStateChanged
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null)
            vi.getLienzo().updateGrosor((int) grosor.getValue());
    }//GEN-LAST:event_grosorStateChanged

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        lienzoNuevo();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        abrirFichero();
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        guardarFichero();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonDuplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDuplicarActionPerformed
        duplicarLienzo();
    }//GEN-LAST:event_botonDuplicarActionPerformed

    /*
        MENU CAMARA
    */
    private void botonCamaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCamaraActionPerformed
        VentanaInternaCamara vi = VentanaInternaCamara.getInstance();
        escritorio.add(vi);
        vi.setVisible(true);
        try {
            vi.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCamaraActionPerformed

    private void botonCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCapturarActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if(vi != null){
            VentanaInterna ventanaNueva = new VentanaInternaImagen(0,0,"Captura", this); 
            ventanaNueva.setTitle("Captura");
            ventanaNueva.getLienzo().setImage(vi.getScreenShot());
            
             escritorio.add(ventanaNueva);
            try {
                ventanaNueva.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
    }//GEN-LAST:event_botonCapturarActionPerformed

    /*
        BRILLO
    */
    private void sliderBrilloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderBrilloFocusGained
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            ColorModel cm = vi.getLienzo().getImage().getColorModel();
            WritableRaster raster = vi.getLienzo().getImage().copyData(null);
            boolean alfaPre = vi.getLienzo().getImage().isAlphaPremultiplied();
            imgSource = new BufferedImage(cm, raster, alfaPre, null);
        }
    }//GEN-LAST:event_sliderBrilloFocusGained

    private void sliderBrilloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderBrilloFocusLost
        imgSource = null;
    }//GEN-LAST:event_sliderBrilloFocusLost

    private void sliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBrilloStateChanged
        
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            try{
                RescaleOp rop = new RescaleOp(1.0f, sliderBrillo.getValue(), null);
                rop.filter(imgSource, vi.getLienzo().getImage());
                vi.getLienzo().repaint();
                escritorio.repaint(); // opt
            }catch(Exception e){
                System.err.println("Error rescale op");
            }
        }
    }//GEN-LAST:event_sliderBrilloStateChanged

    /*
        FILTROS
    */
    private void comboBoxFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFiltrosActionPerformed
       
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            Kernel kernel;
            
            if(comboBoxFiltros.getSelectedIndex() == 0){
                kernel = KernelProducer.createKernel(KernelProducer.TYPE_MEDIA_3x3);
            }else if(comboBoxFiltros.getSelectedIndex() == 1){
                kernel = KernelProducer.createKernel(KernelProducer.TYPE_BINOMIAL_3x3);
            }else if(comboBoxFiltros.getSelectedIndex() == 2){
                kernel = KernelProducer.createKernel(KernelProducer.TYPE_ENFOQUE_3x3);
            }else if(comboBoxFiltros.getSelectedIndex() == 3){
                kernel = KernelProducer.createKernel(KernelProducer.TYPE_RELIEVE_3x3);
            }else{
                kernel = KernelProducer.createKernel(KernelProducer.TYPE_LAPLACIANA_3x3);
            }
            
            ConvolveOp cop = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP,null);
            BufferedImage img = cop.filter(imgSource, null);
            vi.getLienzo().setImage(img);
            vi.getLienzo().repaint();
        }
        
    }//GEN-LAST:event_comboBoxFiltrosActionPerformed

    /*
        CONTRASTE
    */
    private void botonContrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContrasteActionPerformed
        modificarContraste(LookupTableProducer.createLookupTable(LookupTableProducer.TYPE_SFUNCION));
    }//GEN-LAST:event_botonContrasteActionPerformed

    private void botonIluminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIluminarActionPerformed
        modificarContraste(LookupTableProducer.createLookupTable(LookupTableProducer.TYPE_LOGARITHM));
    }//GEN-LAST:event_botonIluminarActionPerformed

    private void botonOscurecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOscurecerActionPerformed
        modificarContraste(LookupTableProducer.createLookupTable(LookupTableProducer.TYPE_POWER));
    }//GEN-LAST:event_botonOscurecerActionPerformed

    private void modificarContraste(LookupTable lt){
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            try{
                LookupOp lop = new LookupOp(lt, null);
                lop.filter(imgSource, imgSource);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println(e.getLocalizedMessage());
            }
        }   
    }
    
    /*
        FUNCION SINUSOIDAL
    */
    private LookupTable seno(double w){
        final double K = 255.0;
        byte lta[] = new byte[256];
        
        for (int x = 0; x < 256; ++x) {
            lta[x] = (byte) (K * Math.abs(Math.sin(Math.toRadians(w/255.0) * x)));
            System.out.println(lta[x]);
        }
        
        return new ByteLookupTable(0, lta);
    }
    
    private void botonSinusoidalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSinusoidalActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            LookupTable lt = seno(180.0f);
            LookupOp lop = new LookupOp(lt,null);
            BufferedImage img = lop.filter(imgSource, null);
            vi.getLienzo().setImage(img);
            vi.getLienzo().repaint();
        }
    }//GEN-LAST:event_botonSinusoidalActionPerformed

    /*
    ROTAR
    */
    private void botonRotar90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRotar90ActionPerformed
        rotar(90);
    }//GEN-LAST:event_botonRotar90ActionPerformed

    private void botonRotar180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRotar180ActionPerformed
        rotar(180);
    }//GEN-LAST:event_botonRotar180ActionPerformed

    private void botonRotar275ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRotar275ActionPerformed
        rotar(270);
    }//GEN-LAST:event_botonRotar275ActionPerformed

    private void sliderRotarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRotarStateChanged
        
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            double a = Math.toRadians(sliderRotar.getValue());
            Point p = new Point(imgSource.getWidth()/2, imgSource.getHeight()/2);
         
            try{
                AffineTransform at = AffineTransform.getRotateInstance(a, p.x, p.y);
                AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                BufferedImage img = atop.filter(imgSource, null);
                vi.getLienzo().setImage(img);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println(e.getLocalizedMessage());
            }
            
        }
    }//GEN-LAST:event_sliderRotarStateChanged

    private void sliderRotarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderRotarFocusGained
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
        }
    }//GEN-LAST:event_sliderRotarFocusGained

    private void sliderRotarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderRotarFocusLost
        imgSource = null;
    }//GEN-LAST:event_sliderRotarFocusLost
   
    private void rotar(int angle){
              
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            double a = Math.toRadians(angle);
            imgSource = vi.getLienzo().getImage();
            Point p = new Point(imgSource.getWidth()/2, imgSource.getHeight()/2);
         
            try{
                AffineTransform at = AffineTransform.getRotateInstance(a, p.x, p.y);
                AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                BufferedImage img = atop.filter(imgSource, null);
                vi.getLienzo().setImage(img);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println(e.getLocalizedMessage());
            }
                                
        }
    }
    
    /*
        ESCALAR
    */
    private void botonAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAumentarActionPerformed
        scale(1.25f);
    }//GEN-LAST:event_botonAumentarActionPerformed

    private void BotonDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDisminuirActionPerformed
        scale(0.75f);
    }//GEN-LAST:event_BotonDisminuirActionPerformed

    private void scale(float s){
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            imgSource = vi.getLienzo().getImage();    
            try{
                AffineTransform at = AffineTransform.getScaleInstance(s, s);
                AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                BufferedImage img = atop.filter(imgSource, null);
                vi.getLienzo().setImage(img);
                vi.getLienzo().repaint();
            }catch(Exception e){
                System.err.println(e.getLocalizedMessage());
            }
            
        }
    }
    
    /*
        BANDAS DE COLORES
    */
    private void botonBandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBandasActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            
            int px = vi.getLocation().x;
            int py = vi.getLocation().y;
            
            for(int i = 0 ; i < imgSource.getRaster().getNumBands() ; ++i){
                px+=20;
                py+=20;
                VentanaInterna ventanaNueva = new VentanaInternaImagen(px, py, "bandas", this);
                ventanaNueva.getLienzo().setImage(getBand(i,imgSource));
                escritorio.add(ventanaNueva);
            }
            
        }
        
    }//GEN-LAST:event_botonBandasActionPerformed

    private BufferedImage getBand(int band, BufferedImage img){
        ColorSpace cs = new GreyColorSpace();//ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ComponentColorModel cm = new ComponentColorModel(cs, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
       
        int bandList[] = {band};
        WritableRaster bandRaster = (WritableRaster)img.getRaster()
                .createWritableChild(0,0,img.getWidth(),img.getHeight(),0,0,bandList);
        
        BufferedImage imgBanda = new BufferedImage(cm, bandRaster, false, null);
        
        return imgBanda;
    }
    
    private void comboBoxEspacioColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEspacioColoresActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            ColorSpace cs = null;

            if(comboBoxEspacioColores.getSelectedIndex() == 0){
                cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
            }else if(comboBoxEspacioColores.getSelectedIndex() == 1 && imgSource.getColorModel().getColorSpace().isCS_sRGB()){
                cs = ColorSpace.getInstance(ColorSpace.CS_PYCC);
            }else if(comboBoxEspacioColores.getSelectedIndex() == 2){
                cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
            }
            
            if(cs != null){
                ColorConvertOp cop = new ColorConvertOp(cs,null);
                BufferedImage img = cop.filter(imgSource, null);

                VentanaInterna ventanaNueva = new VentanaInternaImagen(vi.getX()+20, vi.getY()+20, cs.toString(), this);
                ventanaNueva.getLienzo().setImage(img);
                ventanaNueva.setTitle((String) comboBoxEspacioColores.getSelectedItem());
                escritorio.add(ventanaNueva);
            }
        }
        
        
    }//GEN-LAST:event_comboBoxEspacioColoresActionPerformed

    private void botonSepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSepiaActionPerformed
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        if(vi != null){
            imgSource = vi.getLienzo().getImage();
            SepiaOp so = new SepiaOp();
            BufferedImage img = so.filter(imgSource, null);
            vi.getLienzo().setImage(img);
            vi.getLienzo().repaint();
        }
    }//GEN-LAST:event_botonSepiaActionPerformed

    /*
        REPRODUCTOR DE SONIDO
    */
    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        
        File f = (File)this.comboBoxListaReproduccion.getSelectedItem();
        if(f != null){
            player = new SMSoundPlayer(f);
            if(player != null){
                player.addLineListener(new ManejadorAudio(botonPlay,botonPause));
                player.play();
            }
        }
   
    }//GEN-LAST:event_botonPlayActionPerformed

    private void botonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPauseActionPerformed
        if(player != null){
            player.stop();
        }
        
        if(recorder != null){
            recorder.stop();
            
            File file = new File(recordedFile.getAbsolutePath()){
                @Override
                public String toString(){
                    return this.getName();
                }
            };
            
            this.comboBoxListaReproduccion.addItem(file);                    
        }
        
    }//GEN-LAST:event_botonPauseActionPerformed

    private void botonRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecordActionPerformed
          
        JFileChooser dlg = new JFileChooser();
            int resp = dlg.showSaveDialog(this);
            if(resp == JFileChooser.APPROVE_OPTION){
                try{
                    recordedFile = dlg.getSelectedFile();
                    recorder = new SMSoundRecorder(recordedFile);
                    ((SMSoundRecorder)recorder).addLineListener(new ManejadorGrabador(botonRecord));
                    recorder.record();
                    
                }catch(Exception ex){
                    System.out.println("Error al guardar el archivo");
                }
            }
    }//GEN-LAST:event_botonRecordActionPerformed

    
    /*
    CAMBIAR VENTANA INTERNA
    */
    /**
     * Cambia las opciones seleccionadas segun la ventana interna activada
     * @param lienzo 
     */
    public void cambiarVentanaInterna(Lienzo2D lienzo){
     
        restartBotones();
        
        setFormaSeleccionada(lienzo.getFormaDibujado());
        botonEditar.setSelected(lienzo.getEditar());
        botonRelleno.setSelected(lienzo.getRelleno());
        botonTransparencia.setSelected(lienzo.getTransparencia());
        botonAlisado.setSelected(lienzo.getAlisado());
        grosor.setValue(lienzo.getGrosor());
        comboBoxColores.setSelectedItem(lienzo.getColor());
    }
    
    /**
     * Establece como forma seleccionada de dibujado la forma rcibida por el
     * parametro 
     * @param forma 
     */
    public void setFormaSeleccionada(TipoForma forma){

        if(forma == TipoForma.PUNTO)
            botonLapiz.setSelected(true);
        else if(forma == TipoForma.LINEA)
            botonLinea.setSelected(true);
        else if(forma == TipoForma.RECTANGULO)
            botonRectangulo.setSelected(true);
        else if(forma == TipoForma.ELIPSE)
            botonElipse.setSelected(true);
        else if(forma == TipoForma.CURVA){
            botonCurva.setSelected(true);
        }else if(forma == TipoForma.LIBRE){
            botonLibre.setSelected(true);
        }else if(forma == TipoForma.SEMICIRCULO){
            botonSemicirculo.setSelected(true);
        }
    }
    
    /**
     * Desactiva todos los botones de opciones de dibujo 
     */
    public void restartBotones(){    
        restartBotonesFormas();
        restartBotonesHerramientas();
    }
   
    private void restartBotonesFormas(){
        botonLibre.setSelected(false);
        botonLapiz.setSelected(false);
        botonLinea.setSelected(false);
        botonCurva.setSelected(false);
        botonRectangulo.setSelected(false);
        botonElipse.setSelected(false);   
        botonSemicirculo.setSelected(false);
    }
    
    private void restartBotonesHerramientas(){
        botonEditar.setSelected(false);
        botonRelleno.setSelected(false);
        botonTransparencia.setSelected(false);
        botonAlisado.setSelected(false);
    }
    
    /*
        NUEVO, ABRIR, GUARDAR
    */
    /**
     * Crea un lienzo nevo 
     * @return 
     */
    private VentanaInternaImagen lienzoNuevo(){
        restartBotones();
        
        VentanaInterna ventanaSeleccionada = (VentanaInterna) escritorio.getSelectedFrame();
        VentanaInternaImagen ventanaNueva;
               
        if(ventanaSeleccionada != null){
            ventanaNueva = new VentanaInternaImagen(ventanaSeleccionada.getLocation().x+20, ventanaSeleccionada.getLocation().y+20,"Lienzo nuevo", this);
        }else{
            ventanaNueva = new VentanaInternaImagen(0,0,"Lienzo nuevo", this);        
        }
                
        escritorio.add(ventanaNueva);
        try {
            ventanaNueva.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return ventanaNueva;
    }
    
    /**
     * Abre un fichero nuevo y crea una ventana interna segun la extension del
     * archivo abierto 
     */
    private void abrirFichero(){
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if(resp == JFileChooser.APPROVE_OPTION){
            try{
                File f = dlg.getSelectedFile();
                BufferedImage img = ImageIO.read(f);
                
                String extension = f.getName().substring(f.getName().lastIndexOf(".")+1);
                
                if(extension.equals("jpg")){
                    
                    VentanaInternaImagen vi = new VentanaInternaImagen(0,0,f.getName(),this);
                    escritorio.add(vi);
                    vi.setSelected(true);
                    vi.getLienzo().setImage(img);
                    vi.setTitle(f.getName());
                    
                }else if(extension.equals("wav") || extension.equals("au")){
              
                    File file = new File(f.getAbsolutePath()){
                        @Override
                        public String toString(){
                            return this.getName();
                        }
                    };
                    
                    this.comboBoxListaReproduccion.addItem(file);                    
                    
                }else if(extension.equals("avi") || extension.equals("mp4") || extension.equals("mpg")){
                    
                    VentanaInternaVideo vi = VentanaInternaVideo.getInstance(0,0,f);
                    escritorio.add(vi);
                    vi.setSelected(true);
                }
  
            }catch(Exception ex){
                System.err.println("Error");
            }
        }    
    }
    
    /**
     * GUarda el contenido de la ventana interna seleccionada si es una imagen
     * o dibujo 
     */
    private void guardarFichero(){
        VentanaInterna vi;
        vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            JFileChooser dlg = new JFileChooser();
            int resp = dlg.showSaveDialog(vi.getLienzo());
            if(resp == JFileChooser.APPROVE_OPTION){
                try{
                    BufferedImage img = vi.getLienzo().getImage(true);
                    
                    if(img != null){
                        File f = dlg.getSelectedFile();
                        ImageIO.write(img, "jpg", f);
                        vi.setTitle(f.getName());
                    }
                    
                }catch(Exception ex){
                    System.out.println("Error al guardar el archivo");
                }
            }
        }
    }
    
    /**
     * Duplica el la imagen de una ventana interna y crea otra con la copia
     */
    private void duplicarLienzo() {
        VentanaInterna vi = (VentanaInterna)escritorio.getSelectedFrame();
        
        if(vi != null){
            VentanaInternaImagen ventanaNueva = lienzoNuevo();
            ventanaNueva.duplicarImagen(vi);
        }
        
    }
    
    public JPanel getPanelImagen(){
        return panelImagen;
    }
    
    public JPanel getHerramientasImagen(){
        return herramientasImagen;
    }
    
    public JPanel getHerramientasSonido(){
        return herramientasSonido;
    }
    
    public JDesktopPane getEscritorio(){
        return escritorio;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BotonDisminuir;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuArchivoImprimir;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuFigura;
    private javax.swing.JMenu MenuImagen;
    private javax.swing.JMenu MenuVer;
    private javax.swing.JLabel barraDeEstado;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JToggleButton botonAlisado;
    private javax.swing.JMenuItem botonArchivoAbrir;
    private javax.swing.JMenuItem botonArchivoGuardar;
    private javax.swing.JMenuItem botonArchivoImprimirFichero;
    private javax.swing.JMenuItem botonArchivoImprimirImpresora;
    private javax.swing.JMenuItem botonArchivoNuevo;
    private javax.swing.JButton botonAumentar;
    private javax.swing.JMenuItem botonAyudaAcercaDe;
    private javax.swing.JButton botonBandas;
    private javax.swing.JButton botonCamara;
    private javax.swing.JButton botonCapturar;
    private javax.swing.JButton botonContraste;
    private javax.swing.JToggleButton botonCurva;
    private javax.swing.JButton botonDuplicar;
    private javax.swing.JToggleButton botonEditar;
    private javax.swing.JMenuItem botonEditarCopiar;
    private javax.swing.JMenuItem botonEditarCortar;
    private javax.swing.JMenuItem botonEditarPegar;
    private javax.swing.JToggleButton botonElipse;
    private javax.swing.JMenuItem botonFiguraEnviarAtras;
    private javax.swing.JMenuItem botonFiguraEnviarFondo;
    private javax.swing.JMenuItem botonFiguraTraerAdelante;
    private javax.swing.JMenuItem botonFiguraTraerFrente;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonIluminar;
    private javax.swing.JMenuItem botonImagenAffineTransformOp;
    private javax.swing.JMenuItem botonImagenBandCombineOp;
    private javax.swing.JMenuItem botonImagenColorConvertOp;
    private javax.swing.JMenuItem botonImagenConvolveOp;
    private javax.swing.JMenuItem botonImagenLookupOp;
    private javax.swing.JMenuItem botonImagenRescaleOp;
    private javax.swing.JToggleButton botonLapiz;
    private javax.swing.JToggleButton botonLibre;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonOscurecer;
    private javax.swing.JButton botonPause;
    private javax.swing.JButton botonPlay;
    private javax.swing.JButton botonRecord;
    private javax.swing.JToggleButton botonRectangulo;
    private javax.swing.JToggleButton botonRelleno;
    private javax.swing.JButton botonRotar180;
    private javax.swing.JButton botonRotar275;
    private javax.swing.JButton botonRotar90;
    private javax.swing.JToggleButton botonSemicirculo;
    private javax.swing.JButton botonSepia;
    private javax.swing.JButton botonSinusoidal;
    private javax.swing.JToggleButton botonTransparencia;
    private javax.swing.JCheckBoxMenuItem checkboxVerBarraAudio;
    private javax.swing.JCheckBoxMenuItem checkboxVerBarraDeEstado;
    private javax.swing.JCheckBoxMenuItem checkboxVerBarraImagen;
    private javax.swing.JComboBox<Color> comboBoxColores;
    private javax.swing.JComboBox<String> comboBoxEspacioColores;
    private javax.swing.JComboBox<String> comboBoxFiltros;
    private javax.swing.JComboBox<File> comboBoxListaReproduccion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JSpinner grosor;
    private javax.swing.JPanel herramientasImagen;
    private javax.swing.JPanel herramientasSonido;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private java.awt.Label labelTiempoGrabacion;
    private javax.swing.JPanel panelArchivo;
    private javax.swing.JPanel panelBrillo;
    private javax.swing.JPanel panelCamara;
    private javax.swing.JPanel panelColor;
    private javax.swing.JPanel panelContraste;
    private javax.swing.JPanel panelEscala;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JPanel panelHerramientas;
    private javax.swing.JPanel panelHerramientas2;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelRotacion;
    private javax.swing.JPanel panelSinusoidal;
    private javax.swing.JSlider sliderBrillo;
    private javax.swing.JSlider sliderRotar;
    // End of variables declaration//GEN-END:variables

}