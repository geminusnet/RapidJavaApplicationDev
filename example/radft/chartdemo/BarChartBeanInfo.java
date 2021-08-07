package chartdemo;

import java.beans.*;

public class BarChartBeanInfo extends SimpleBeanInfo {


  // Bean descriptor //GEN-FIRST:BeanDescriptor
  private static BeanDescriptor beanDescriptor = new BeanDescriptor  ( BarChart.class , null );

  static {//GEN-HEADEREND:BeanDescriptor

    // Here you can add code for customizing the BeanDescriptor.

}//GEN-LAST:BeanDescriptor

  // Property identifiers //GEN-FIRST:Properties
  private static final int PROPERTY_background = 0;
  private static final int PROPERTY_font = 1;
  private static final int PROPERTY_maximumSize = 2;
  private static final int PROPERTY_insets = 3;
  private static final int PROPERTY_accessibleContext = 4;
  private static final int PROPERTY_opaque = 5;
  private static final int PROPERTY_model = 6;
  private static final int PROPERTY_showing = 7;
  private static final int PROPERTY_preferredSize = 8;
  private static final int PROPERTY_autoscrolls = 9;
  private static final int PROPERTY_y = 10;
  private static final int PROPERTY_verifyInputWhenFocusTarget = 11;
  private static final int PROPERTY_x = 12;
  private static final int PROPERTY_graphicsConfiguration = 13;
  private static final int PROPERTY_toolkit = 14;
  private static final int PROPERTY_valid = 15;
  private static final int PROPERTY_width = 16;
  private static final int PROPERTY_actionMap = 17;
  private static final int PROPERTY_locationOnScreen = 18;
  private static final int PROPERTY_displayable = 19;
  private static final int PROPERTY_paintingTile = 20;
  private static final int PROPERTY_enabled = 21;
  private static final int PROPERTY_parent = 22;
  private static final int PROPERTY_inputMethodRequests = 23;
  private static final int PROPERTY_topLevelAncestor = 24;
  private static final int PROPERTY_bounds = 25;
  private static final int PROPERTY_inputVerifier = 26;
  private static final int PROPERTY_rootPane = 27;
  private static final int PROPERTY_lightweight = 28;
  private static final int PROPERTY_visible = 29;
  private static final int PROPERTY_componentCount = 30;
  private static final int PROPERTY_border = 31;
  private static final int PROPERTY_focusCycleRoot = 32;
  private static final int PROPERTY_layout = 33;
  private static final int PROPERTY_components = 34;
  private static final int PROPERTY_graphics = 35;
  private static final int PROPERTY_managingFocus = 36;
  private static final int PROPERTY_componentOrientation = 37;
  private static final int PROPERTY_UIClassID = 38;
  private static final int PROPERTY_inputContext = 39;
  private static final int PROPERTY_foreground = 40;
  private static final int PROPERTY_colorModel = 41;
  private static final int PROPERTY_registeredKeyStrokes = 42;
  private static final int PROPERTY_minimumSizeSet = 43;
  private static final int PROPERTY_doubleBuffered = 44;
  private static final int PROPERTY_nextFocusableComponent = 45;
  private static final int PROPERTY_toolTipText = 46;
  private static final int PROPERTY_requestFocusEnabled = 47;
  private static final int PROPERTY_treeLock = 48;
  private static final int PROPERTY_validateRoot = 49;
  private static final int PROPERTY_locale = 50;
  private static final int PROPERTY_visibleRect = 51;
  private static final int PROPERTY_debugGraphicsOptions = 52;
  private static final int PROPERTY_height = 53;
  private static final int PROPERTY_dropTarget = 54;
  private static final int PROPERTY_name = 55;
  private static final int PROPERTY_focusTraversable = 56;
  private static final int PROPERTY_alignmentY = 57;
  private static final int PROPERTY_alignmentX = 58;
  private static final int PROPERTY_minimumSize = 59;
  private static final int PROPERTY_maximumSizeSet = 60;
  private static final int PROPERTY_preferredSizeSet = 61;
  private static final int PROPERTY_peer = 62;
  private static final int PROPERTY_optimizedDrawingEnabled = 63;
  private static final int PROPERTY_cursor = 64;
  private static final int PROPERTY_component = 65;

  // Property array 
  private static PropertyDescriptor[] properties = new PropertyDescriptor[66];

  static {
    try {
      properties[PROPERTY_background] = new PropertyDescriptor ( "background", BarChart.class, "getBackground", "setBackground" );
      properties[PROPERTY_font] = new PropertyDescriptor ( "font", BarChart.class, "getFont", "setFont" );
      properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", BarChart.class, "getMaximumSize", "setMaximumSize" );
      properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", BarChart.class, "getInsets", null );
      properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", BarChart.class, "getAccessibleContext", null );
      properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", BarChart.class, "isOpaque", "setOpaque" );
      properties[PROPERTY_model] = new PropertyDescriptor ( "model", BarChart.class, "getModel", "setModel" );
      properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", BarChart.class, "isShowing", null );
      properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", BarChart.class, "getPreferredSize", "setPreferredSize" );
      properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", BarChart.class, "getAutoscrolls", "setAutoscrolls" );
      properties[PROPERTY_y] = new PropertyDescriptor ( "y", BarChart.class, "getY", null );
      properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", BarChart.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" );
      properties[PROPERTY_x] = new PropertyDescriptor ( "x", BarChart.class, "getX", null );
      properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", BarChart.class, "getGraphicsConfiguration", null );
      properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", BarChart.class, "getToolkit", null );
      properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", BarChart.class, "isValid", null );
      properties[PROPERTY_width] = new PropertyDescriptor ( "width", BarChart.class, "getWidth", null );
      properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", BarChart.class, "getActionMap", "setActionMap" );
      properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", BarChart.class, "getLocationOnScreen", null );
      properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", BarChart.class, "isDisplayable", null );
      properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", BarChart.class, "isPaintingTile", null );
      properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", BarChart.class, "isEnabled", "setEnabled" );
      properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", BarChart.class, "getParent", null );
      properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", BarChart.class, "getInputMethodRequests", null );
      properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", BarChart.class, "getTopLevelAncestor", null );
      properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", BarChart.class, "getBounds", "setBounds" );
      properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", BarChart.class, "getInputVerifier", "setInputVerifier" );
      properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", BarChart.class, "getRootPane", null );
      properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", BarChart.class, "isLightweight", null );
      properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", BarChart.class, "isVisible", "setVisible" );
      properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", BarChart.class, "getComponentCount", null );
      properties[PROPERTY_border] = new PropertyDescriptor ( "border", BarChart.class, "getBorder", "setBorder" );
      properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", BarChart.class, "isFocusCycleRoot", null );
      properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", BarChart.class, "getLayout", "setLayout" );
      properties[PROPERTY_components] = new PropertyDescriptor ( "components", BarChart.class, "getComponents", null );
      properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", BarChart.class, "getGraphics", null );
      properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", BarChart.class, "isManagingFocus", null );
      properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", BarChart.class, "getComponentOrientation", "setComponentOrientation" );
      properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", BarChart.class, "getUIClassID", null );
      properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", BarChart.class, "getInputContext", null );
      properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", BarChart.class, "getForeground", "setForeground" );
      properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", BarChart.class, "getColorModel", null );
      properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", BarChart.class, "getRegisteredKeyStrokes", null );
      properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", BarChart.class, "isMinimumSizeSet", null );
      properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", BarChart.class, "isDoubleBuffered", "setDoubleBuffered" );
      properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", BarChart.class, "getNextFocusableComponent", "setNextFocusableComponent" );
      properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", BarChart.class, "getToolTipText", "setToolTipText" );
      properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", BarChart.class, "isRequestFocusEnabled", "setRequestFocusEnabled" );
      properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", BarChart.class, "getTreeLock", null );
      properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", BarChart.class, "isValidateRoot", null );
      properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", BarChart.class, "getLocale", "setLocale" );
      properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", BarChart.class, "getVisibleRect", null );
      properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", BarChart.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" );
      properties[PROPERTY_height] = new PropertyDescriptor ( "height", BarChart.class, "getHeight", null );
      properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", BarChart.class, "getDropTarget", "setDropTarget" );
      properties[PROPERTY_name] = new PropertyDescriptor ( "name", BarChart.class, "getName", "setName" );
      properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", BarChart.class, "isFocusTraversable", null );
      properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", BarChart.class, "getAlignmentY", "setAlignmentY" );
      properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", BarChart.class, "getAlignmentX", "setAlignmentX" );
      properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", BarChart.class, "getMinimumSize", "setMinimumSize" );
      properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", BarChart.class, "isMaximumSizeSet", null );
      properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", BarChart.class, "isPreferredSizeSet", null );
      properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", BarChart.class, "getPeer", null );
      properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", BarChart.class, "isOptimizedDrawingEnabled", null );
      properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", BarChart.class, "getCursor", "setCursor" );
      properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", BarChart.class, null, null, "getComponent", null );
    }
    catch( IntrospectionException e) {}//GEN-HEADEREND:Properties

    // Here you can add code for customizing the properties array.

}//GEN-LAST:Properties

  // EventSet identifiers//GEN-FIRST:Events
  private static final int EVENT_mouseMotionListener = 0;
  private static final int EVENT_ancestorListener = 1;
  private static final int EVENT_inputMethodListener = 2;
  private static final int EVENT_componentListener = 3;
  private static final int EVENT_hierarchyBoundsListener = 4;
  private static final int EVENT_mouseListener = 5;
  private static final int EVENT_focusListener = 6;
  private static final int EVENT_propertyChangeListener = 7;
  private static final int EVENT_keyListener = 8;
  private static final int EVENT_hierarchyListener = 9;
  private static final int EVENT_containerListener = 10;
  private static final int EVENT_vetoableChangeListener = 11;

  // EventSet array
  private static EventSetDescriptor[] eventSets = new EventSetDescriptor[12];

  static {
    try {
      eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" );
      eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" );
      eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" );
      eventSets[EVENT_componentListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentShown", "componentResized", "componentHidden", "componentMoved"}, "addComponentListener", "removeComponentListener" );
      eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorResized", "ancestorMoved"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" );
      eventSets[EVENT_mouseListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseReleased", "mouseEntered", "mouseClicked", "mousePressed", "mouseExited"}, "addMouseListener", "removeMouseListener" );
      eventSets[EVENT_focusListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" );
      eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" );
      eventSets[EVENT_keyListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyReleased", "keyPressed", "keyTyped"}, "addKeyListener", "removeKeyListener" );
      eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" );
      eventSets[EVENT_containerListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentRemoved", "componentAdded"}, "addContainerListener", "removeContainerListener" );
      eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( chartdemo.BarChart.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" );
    }
    catch( IntrospectionException e) {}//GEN-HEADEREND:Events

    // Here you can add code for customizing the event sets array.

}//GEN-LAST:Events

  // Method identifiers //GEN-FIRST:Methods
  private static final int METHOD_paintComponent0 = 0;
  private static final int METHOD_actionPerformed1 = 1;
  private static final int METHOD_updateUI2 = 2;
  private static final int METHOD_hasFocus3 = 3;
  private static final int METHOD_unregisterKeyboardAction4 = 4;
  private static final int METHOD_revalidate5 = 5;
  private static final int METHOD_getListeners6 = 6;
  private static final int METHOD_getInputMap7 = 7;
  private static final int METHOD_removeNotify8 = 8;
  private static final int METHOD_getToolTipLocation9 = 9;
  private static final int METHOD_getBounds10 = 10;
  private static final int METHOD_firePropertyChange11 = 11;
  private static final int METHOD_getActionForKeyStroke12 = 12;
  private static final int METHOD_firePropertyChange13 = 13;
  private static final int METHOD_repaint14 = 14;
  private static final int METHOD_getInputMap15 = 15;
  private static final int METHOD_firePropertyChange16 = 16;
  private static final int METHOD_firePropertyChange17 = 17;
  private static final int METHOD_repaint18 = 18;
  private static final int METHOD_addPropertyChangeListener19 = 19;
  private static final int METHOD_computeVisibleRect20 = 20;
  private static final int METHOD_hide21 = 21;
  private static final int METHOD_reshape22 = 22;
  private static final int METHOD_putClientProperty23 = 23;
  private static final int METHOD_getLocation24 = 24;
  private static final int METHOD_setInputMap25 = 25;
  private static final int METHOD_paintImmediately26 = 26;
  private static final int METHOD_disable27 = 27;
  private static final int METHOD_resetKeyboardActions28 = 28;
  private static final int METHOD_enable29 = 29;
  private static final int METHOD_grabFocus30 = 30;
  private static final int METHOD_getToolTipText31 = 31;
  private static final int METHOD_getClientProperty32 = 32;
  private static final int METHOD_getSize33 = 33;
  private static final int METHOD_firePropertyChange34 = 34;
  private static final int METHOD_removePropertyChangeListener35 = 35;
  private static final int METHOD_requestDefaultFocus36 = 36;
  private static final int METHOD_addNotify37 = 37;
  private static final int METHOD_firePropertyChange38 = 38;
  private static final int METHOD_requestFocus39 = 39;
  private static final int METHOD_getConditionForKeyStroke40 = 40;
  private static final int METHOD_firePropertyChange41 = 41;
  private static final int METHOD_registerKeyboardAction42 = 42;
  private static final int METHOD_registerKeyboardAction43 = 43;
  private static final int METHOD_isLightweightComponent44 = 44;
  private static final int METHOD_paint45 = 45;
  private static final int METHOD_createToolTip46 = 46;
  private static final int METHOD_print47 = 47;
  private static final int METHOD_update48 = 48;
  private static final int METHOD_paintImmediately49 = 49;
  private static final int METHOD_getInsets50 = 50;
  private static final int METHOD_printAll51 = 51;
  private static final int METHOD_contains52 = 52;
  private static final int METHOD_firePropertyChange53 = 53;
  private static final int METHOD_scrollRectToVisible54 = 54;
  private static final int METHOD_getComponentAt55 = 55;
  private static final int METHOD_add56 = 56;
  private static final int METHOD_preferredSize57 = 57;
  private static final int METHOD_locate58 = 58;
  private static final int METHOD_list59 = 59;
  private static final int METHOD_add60 = 60;
  private static final int METHOD_add61 = 61;
  private static final int METHOD_invalidate62 = 62;
  private static final int METHOD_printComponents63 = 63;
  private static final int METHOD_doLayout64 = 64;
  private static final int METHOD_layout65 = 65;
  private static final int METHOD_list66 = 66;
  private static final int METHOD_add67 = 67;
  private static final int METHOD_remove68 = 68;
  private static final int METHOD_isAncestorOf69 = 69;
  private static final int METHOD_findComponentAt70 = 70;
  private static final int METHOD_findComponentAt71 = 71;
  private static final int METHOD_insets72 = 72;
  private static final int METHOD_getComponentAt73 = 73;
  private static final int METHOD_paintComponents74 = 74;
  private static final int METHOD_countComponents75 = 75;
  private static final int METHOD_minimumSize76 = 76;
  private static final int METHOD_deliverEvent77 = 77;
  private static final int METHOD_removeAll78 = 78;
  private static final int METHOD_remove79 = 79;
  private static final int METHOD_add80 = 80;
  private static final int METHOD_validate81 = 81;
  private static final int METHOD_gotFocus82 = 82;
  private static final int METHOD_toString83 = 83;
  private static final int METHOD_list84 = 84;
  private static final int METHOD_enableInputMethods85 = 85;
  private static final int METHOD_mouseEnter86 = 86;
  private static final int METHOD_getSize87 = 87;
  private static final int METHOD_add88 = 88;
  private static final int METHOD_contains89 = 89;
  private static final int METHOD_transferFocus90 = 90;
  private static final int METHOD_action91 = 91;
  private static final int METHOD_setSize92 = 92;
  private static final int METHOD_show93 = 93;
  private static final int METHOD_mouseDown94 = 94;
  private static final int METHOD_imageUpdate95 = 95;
  private static final int METHOD_repaint96 = 96;
  private static final int METHOD_getFontMetrics97 = 97;
  private static final int METHOD_lostFocus98 = 98;
  private static final int METHOD_postEvent99 = 99;
  private static final int METHOD_show100 = 100;
  private static final int METHOD_handleEvent101 = 101;
  private static final int METHOD_list102 = 102;
  private static final int METHOD_setBounds103 = 103;
  private static final int METHOD_mouseDrag104 = 104;
  private static final int METHOD_enable105 = 105;
  private static final int METHOD_createImage106 = 106;
  private static final int METHOD_keyUp107 = 107;
  private static final int METHOD_createImage108 = 108;
  private static final int METHOD_setLocation109 = 109;
  private static final int METHOD_repaint110 = 110;
  private static final int METHOD_repaint111 = 111;
  private static final int METHOD_keyDown112 = 112;
  private static final int METHOD_nextFocus113 = 113;
  private static final int METHOD_bounds114 = 114;
  private static final int METHOD_move115 = 115;
  private static final int METHOD_prepareImage116 = 116;
  private static final int METHOD_prepareImage117 = 117;
  private static final int METHOD_resize118 = 118;
  private static final int METHOD_getLocation119 = 119;
  private static final int METHOD_remove120 = 120;
  private static final int METHOD_setSize121 = 121;
  private static final int METHOD_list122 = 122;
  private static final int METHOD_location123 = 123;
  private static final int METHOD_paintAll124 = 124;
  private static final int METHOD_dispatchEvent125 = 125;
  private static final int METHOD_checkImage126 = 126;
  private static final int METHOD_checkImage127 = 127;
  private static final int METHOD_mouseExit128 = 128;
  private static final int METHOD_mouseMove129 = 129;
  private static final int METHOD_setLocation130 = 130;
  private static final int METHOD_mouseUp131 = 131;
  private static final int METHOD_size132 = 132;
  private static final int METHOD_inside133 = 133;
  private static final int METHOD_resize134 = 134;

  // Method array 
  private static MethodDescriptor[] methods = new MethodDescriptor[135];

  static {
    try {
      methods[METHOD_paintComponent0] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("paintComponent", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_paintComponent0].setDisplayName ( "" );
      methods[METHOD_actionPerformed1] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("actionPerformed", new Class[] {java.awt.event.ActionEvent.class}));
      methods[METHOD_actionPerformed1].setDisplayName ( "" );
      methods[METHOD_updateUI2] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("updateUI", new Class[] {}));
      methods[METHOD_updateUI2].setDisplayName ( "" );
      methods[METHOD_hasFocus3] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("hasFocus", new Class[] {}));
      methods[METHOD_hasFocus3].setDisplayName ( "" );
      methods[METHOD_unregisterKeyboardAction4] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class}));
      methods[METHOD_unregisterKeyboardAction4].setDisplayName ( "" );
      methods[METHOD_revalidate5] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("revalidate", new Class[] {}));
      methods[METHOD_revalidate5].setDisplayName ( "" );
      methods[METHOD_getListeners6] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getListeners", new Class[] {java.lang.Class.class}));
      methods[METHOD_getListeners6].setDisplayName ( "" );
      methods[METHOD_getInputMap7] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getInputMap", new Class[] {}));
      methods[METHOD_getInputMap7].setDisplayName ( "" );
      methods[METHOD_removeNotify8] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("removeNotify", new Class[] {}));
      methods[METHOD_removeNotify8].setDisplayName ( "" );
      methods[METHOD_getToolTipLocation9] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class}));
      methods[METHOD_getToolTipLocation9].setDisplayName ( "" );
      methods[METHOD_getBounds10] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class}));
      methods[METHOD_getBounds10].setDisplayName ( "" );
      methods[METHOD_firePropertyChange11] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Double.TYPE, Double.TYPE}));
      methods[METHOD_firePropertyChange11].setDisplayName ( "" );
      methods[METHOD_getActionForKeyStroke12] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class}));
      methods[METHOD_getActionForKeyStroke12].setDisplayName ( "" );
      methods[METHOD_firePropertyChange13] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Character.TYPE, Character.TYPE}));
      methods[METHOD_firePropertyChange13].setDisplayName ( "" );
      methods[METHOD_repaint14] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class}));
      methods[METHOD_repaint14].setDisplayName ( "" );
      methods[METHOD_getInputMap15] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getInputMap", new Class[] {Integer.TYPE}));
      methods[METHOD_getInputMap15].setDisplayName ( "" );
      methods[METHOD_firePropertyChange16] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Float.TYPE, Float.TYPE}));
      methods[METHOD_firePropertyChange16].setDisplayName ( "" );
      methods[METHOD_firePropertyChange17] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_firePropertyChange17].setDisplayName ( "" );
      methods[METHOD_repaint18] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("repaint", new Class[] {Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_repaint18].setDisplayName ( "" );
      methods[METHOD_addPropertyChangeListener19] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class}));
      methods[METHOD_addPropertyChangeListener19].setDisplayName ( "" );
      methods[METHOD_computeVisibleRect20] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class}));
      methods[METHOD_computeVisibleRect20].setDisplayName ( "" );
      methods[METHOD_hide21] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("hide", new Class[] {}));
      methods[METHOD_hide21].setDisplayName ( "" );
      methods[METHOD_reshape22] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("reshape", new Class[] {Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_reshape22].setDisplayName ( "" );
      methods[METHOD_putClientProperty23] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class}));
      methods[METHOD_putClientProperty23].setDisplayName ( "" );
      methods[METHOD_getLocation24] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getLocation", new Class[] {java.awt.Point.class}));
      methods[METHOD_getLocation24].setDisplayName ( "" );
      methods[METHOD_setInputMap25] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("setInputMap", new Class[] {Integer.TYPE, javax.swing.InputMap.class}));
      methods[METHOD_setInputMap25].setDisplayName ( "" );
      methods[METHOD_paintImmediately26] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class}));
      methods[METHOD_paintImmediately26].setDisplayName ( "" );
      methods[METHOD_disable27] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("disable", new Class[] {}));
      methods[METHOD_disable27].setDisplayName ( "" );
      methods[METHOD_resetKeyboardActions28] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("resetKeyboardActions", new Class[] {}));
      methods[METHOD_resetKeyboardActions28].setDisplayName ( "" );
      methods[METHOD_enable29] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("enable", new Class[] {}));
      methods[METHOD_enable29].setDisplayName ( "" );
      methods[METHOD_grabFocus30] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("grabFocus", new Class[] {}));
      methods[METHOD_grabFocus30].setDisplayName ( "" );
      methods[METHOD_getToolTipText31] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class}));
      methods[METHOD_getToolTipText31].setDisplayName ( "" );
      methods[METHOD_getClientProperty32] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class}));
      methods[METHOD_getClientProperty32].setDisplayName ( "" );
      methods[METHOD_getSize33] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getSize", new Class[] {java.awt.Dimension.class}));
      methods[METHOD_getSize33].setDisplayName ( "" );
      methods[METHOD_firePropertyChange34] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Long.TYPE, Long.TYPE}));
      methods[METHOD_firePropertyChange34].setDisplayName ( "" );
      methods[METHOD_removePropertyChangeListener35] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class}));
      methods[METHOD_removePropertyChangeListener35].setDisplayName ( "" );
      methods[METHOD_requestDefaultFocus36] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("requestDefaultFocus", new Class[] {}));
      methods[METHOD_requestDefaultFocus36].setDisplayName ( "" );
      methods[METHOD_addNotify37] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("addNotify", new Class[] {}));
      methods[METHOD_addNotify37].setDisplayName ( "" );
      methods[METHOD_firePropertyChange38] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Byte.TYPE, Byte.TYPE}));
      methods[METHOD_firePropertyChange38].setDisplayName ( "" );
      methods[METHOD_requestFocus39] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("requestFocus", new Class[] {}));
      methods[METHOD_requestFocus39].setDisplayName ( "" );
      methods[METHOD_getConditionForKeyStroke40] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class}));
      methods[METHOD_getConditionForKeyStroke40].setDisplayName ( "" );
      methods[METHOD_firePropertyChange41] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Short.TYPE, Short.TYPE}));
      methods[METHOD_firePropertyChange41].setDisplayName ( "" );
      methods[METHOD_registerKeyboardAction42] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, Integer.TYPE}));
      methods[METHOD_registerKeyboardAction42].setDisplayName ( "" );
      methods[METHOD_registerKeyboardAction43] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, Integer.TYPE}));
      methods[METHOD_registerKeyboardAction43].setDisplayName ( "" );
      methods[METHOD_isLightweightComponent44] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class}));
      methods[METHOD_isLightweightComponent44].setDisplayName ( "" );
      methods[METHOD_paint45] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("paint", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_paint45].setDisplayName ( "" );
      methods[METHOD_createToolTip46] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("createToolTip", new Class[] {}));
      methods[METHOD_createToolTip46].setDisplayName ( "" );
      methods[METHOD_print47] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("print", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_print47].setDisplayName ( "" );
      methods[METHOD_update48] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("update", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_update48].setDisplayName ( "" );
      methods[METHOD_paintImmediately49] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("paintImmediately", new Class[] {Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_paintImmediately49].setDisplayName ( "" );
      methods[METHOD_getInsets50] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getInsets", new Class[] {java.awt.Insets.class}));
      methods[METHOD_getInsets50].setDisplayName ( "" );
      methods[METHOD_printAll51] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("printAll", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_printAll51].setDisplayName ( "" );
      methods[METHOD_contains52] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("contains", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_contains52].setDisplayName ( "" );
      methods[METHOD_firePropertyChange53] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, Boolean.TYPE, Boolean.TYPE}));
      methods[METHOD_firePropertyChange53].setDisplayName ( "" );
      methods[METHOD_scrollRectToVisible54] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class}));
      methods[METHOD_scrollRectToVisible54].setDisplayName ( "" );
      methods[METHOD_getComponentAt55] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class}));
      methods[METHOD_getComponentAt55].setDisplayName ( "" );
      methods[METHOD_add56] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("add", new Class[] {java.awt.Component.class}));
      methods[METHOD_add56].setDisplayName ( "" );
      methods[METHOD_preferredSize57] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("preferredSize", new Class[] {}));
      methods[METHOD_preferredSize57].setDisplayName ( "" );
      methods[METHOD_locate58] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("locate", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_locate58].setDisplayName ( "" );
      methods[METHOD_list59] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("list", new Class[] {java.io.PrintWriter.class, Integer.TYPE}));
      methods[METHOD_list59].setDisplayName ( "" );
      methods[METHOD_add60] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("add", new Class[] {java.awt.Component.class, Integer.TYPE}));
      methods[METHOD_add60].setDisplayName ( "" );
      methods[METHOD_add61] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, Integer.TYPE}));
      methods[METHOD_add61].setDisplayName ( "" );
      methods[METHOD_invalidate62] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("invalidate", new Class[] {}));
      methods[METHOD_invalidate62].setDisplayName ( "" );
      methods[METHOD_printComponents63] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_printComponents63].setDisplayName ( "" );
      methods[METHOD_doLayout64] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("doLayout", new Class[] {}));
      methods[METHOD_doLayout64].setDisplayName ( "" );
      methods[METHOD_layout65] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("layout", new Class[] {}));
      methods[METHOD_layout65].setDisplayName ( "" );
      methods[METHOD_list66] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("list", new Class[] {java.io.PrintStream.class, Integer.TYPE}));
      methods[METHOD_list66].setDisplayName ( "" );
      methods[METHOD_add67] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class}));
      methods[METHOD_add67].setDisplayName ( "" );
      methods[METHOD_remove68] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("remove", new Class[] {Integer.TYPE}));
      methods[METHOD_remove68].setDisplayName ( "" );
      methods[METHOD_isAncestorOf69] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class}));
      methods[METHOD_isAncestorOf69].setDisplayName ( "" );
      methods[METHOD_findComponentAt70] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("findComponentAt", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_findComponentAt70].setDisplayName ( "" );
      methods[METHOD_findComponentAt71] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class}));
      methods[METHOD_findComponentAt71].setDisplayName ( "" );
      methods[METHOD_insets72] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("insets", new Class[] {}));
      methods[METHOD_insets72].setDisplayName ( "" );
      methods[METHOD_getComponentAt73] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getComponentAt", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_getComponentAt73].setDisplayName ( "" );
      methods[METHOD_paintComponents74] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_paintComponents74].setDisplayName ( "" );
      methods[METHOD_countComponents75] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("countComponents", new Class[] {}));
      methods[METHOD_countComponents75].setDisplayName ( "" );
      methods[METHOD_minimumSize76] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("minimumSize", new Class[] {}));
      methods[METHOD_minimumSize76].setDisplayName ( "" );
      methods[METHOD_deliverEvent77] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class}));
      methods[METHOD_deliverEvent77].setDisplayName ( "" );
      methods[METHOD_removeAll78] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("removeAll", new Class[] {}));
      methods[METHOD_removeAll78].setDisplayName ( "" );
      methods[METHOD_remove79] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("remove", new Class[] {java.awt.Component.class}));
      methods[METHOD_remove79].setDisplayName ( "" );
      methods[METHOD_add80] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class}));
      methods[METHOD_add80].setDisplayName ( "" );
      methods[METHOD_validate81] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("validate", new Class[] {}));
      methods[METHOD_validate81].setDisplayName ( "" );
      methods[METHOD_gotFocus82] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class}));
      methods[METHOD_gotFocus82].setDisplayName ( "" );
      methods[METHOD_toString83] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("toString", new Class[] {}));
      methods[METHOD_toString83].setDisplayName ( "" );
      methods[METHOD_list84] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("list", new Class[] {java.io.PrintStream.class}));
      methods[METHOD_list84].setDisplayName ( "" );
      methods[METHOD_enableInputMethods85] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("enableInputMethods", new Class[] {Boolean.TYPE}));
      methods[METHOD_enableInputMethods85].setDisplayName ( "" );
      methods[METHOD_mouseEnter86] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_mouseEnter86].setDisplayName ( "" );
      methods[METHOD_getSize87] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getSize", new Class[] {}));
      methods[METHOD_getSize87].setDisplayName ( "" );
      methods[METHOD_add88] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("add", new Class[] {java.awt.PopupMenu.class}));
      methods[METHOD_add88].setDisplayName ( "" );
      methods[METHOD_contains89] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("contains", new Class[] {java.awt.Point.class}));
      methods[METHOD_contains89].setDisplayName ( "" );
      methods[METHOD_transferFocus90] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("transferFocus", new Class[] {}));
      methods[METHOD_transferFocus90].setDisplayName ( "" );
      methods[METHOD_action91] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class}));
      methods[METHOD_action91].setDisplayName ( "" );
      methods[METHOD_setSize92] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("setSize", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_setSize92].setDisplayName ( "" );
      methods[METHOD_show93] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("show", new Class[] {}));
      methods[METHOD_show93].setDisplayName ( "" );
      methods[METHOD_mouseDown94] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_mouseDown94].setDisplayName ( "" );
      methods[METHOD_imageUpdate95] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_imageUpdate95].setDisplayName ( "" );
      methods[METHOD_repaint96] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("repaint", new Class[] {Long.TYPE}));
      methods[METHOD_repaint96].setDisplayName ( "" );
      methods[METHOD_getFontMetrics97] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class}));
      methods[METHOD_getFontMetrics97].setDisplayName ( "" );
      methods[METHOD_lostFocus98] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class}));
      methods[METHOD_lostFocus98].setDisplayName ( "" );
      methods[METHOD_postEvent99] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("postEvent", new Class[] {java.awt.Event.class}));
      methods[METHOD_postEvent99].setDisplayName ( "" );
      methods[METHOD_show100] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("show", new Class[] {Boolean.TYPE}));
      methods[METHOD_show100].setDisplayName ( "" );
      methods[METHOD_handleEvent101] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("handleEvent", new Class[] {java.awt.Event.class}));
      methods[METHOD_handleEvent101].setDisplayName ( "" );
      methods[METHOD_list102] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("list", new Class[] {java.io.PrintWriter.class}));
      methods[METHOD_list102].setDisplayName ( "" );
      methods[METHOD_setBounds103] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("setBounds", new Class[] {Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_setBounds103].setDisplayName ( "" );
      methods[METHOD_mouseDrag104] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_mouseDrag104].setDisplayName ( "" );
      methods[METHOD_enable105] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("enable", new Class[] {Boolean.TYPE}));
      methods[METHOD_enable105].setDisplayName ( "" );
      methods[METHOD_createImage106] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class}));
      methods[METHOD_createImage106].setDisplayName ( "" );
      methods[METHOD_keyUp107] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("keyUp", new Class[] {java.awt.Event.class, Integer.TYPE}));
      methods[METHOD_keyUp107].setDisplayName ( "" );
      methods[METHOD_createImage108] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("createImage", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_createImage108].setDisplayName ( "" );
      methods[METHOD_setLocation109] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("setLocation", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_setLocation109].setDisplayName ( "" );
      methods[METHOD_repaint110] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("repaint", new Class[] {Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_repaint110].setDisplayName ( "" );
      methods[METHOD_repaint111] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("repaint", new Class[] {}));
      methods[METHOD_repaint111].setDisplayName ( "" );
      methods[METHOD_keyDown112] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("keyDown", new Class[] {java.awt.Event.class, Integer.TYPE}));
      methods[METHOD_keyDown112].setDisplayName ( "" );
      methods[METHOD_nextFocus113] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("nextFocus", new Class[] {}));
      methods[METHOD_nextFocus113].setDisplayName ( "" );
      methods[METHOD_bounds114] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("bounds", new Class[] {}));
      methods[METHOD_bounds114].setDisplayName ( "" );
      methods[METHOD_move115] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("move", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_move115].setDisplayName ( "" );
      methods[METHOD_prepareImage116] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, Integer.TYPE, Integer.TYPE, java.awt.image.ImageObserver.class}));
      methods[METHOD_prepareImage116].setDisplayName ( "" );
      methods[METHOD_prepareImage117] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class}));
      methods[METHOD_prepareImage117].setDisplayName ( "" );
      methods[METHOD_resize118] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("resize", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_resize118].setDisplayName ( "" );
      methods[METHOD_getLocation119] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("getLocation", new Class[] {}));
      methods[METHOD_getLocation119].setDisplayName ( "" );
      methods[METHOD_remove120] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class}));
      methods[METHOD_remove120].setDisplayName ( "" );
      methods[METHOD_setSize121] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("setSize", new Class[] {java.awt.Dimension.class}));
      methods[METHOD_setSize121].setDisplayName ( "" );
      methods[METHOD_list122] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("list", new Class[] {}));
      methods[METHOD_list122].setDisplayName ( "" );
      methods[METHOD_location123] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("location", new Class[] {}));
      methods[METHOD_location123].setDisplayName ( "" );
      methods[METHOD_paintAll124] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class}));
      methods[METHOD_paintAll124].setDisplayName ( "" );
      methods[METHOD_dispatchEvent125] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class}));
      methods[METHOD_dispatchEvent125].setDisplayName ( "" );
      methods[METHOD_checkImage126] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class}));
      methods[METHOD_checkImage126].setDisplayName ( "" );
      methods[METHOD_checkImage127] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("checkImage", new Class[] {java.awt.Image.class, Integer.TYPE, Integer.TYPE, java.awt.image.ImageObserver.class}));
      methods[METHOD_checkImage127].setDisplayName ( "" );
      methods[METHOD_mouseExit128] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_mouseExit128].setDisplayName ( "" );
      methods[METHOD_mouseMove129] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_mouseMove129].setDisplayName ( "" );
      methods[METHOD_setLocation130] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("setLocation", new Class[] {java.awt.Point.class}));
      methods[METHOD_setLocation130].setDisplayName ( "" );
      methods[METHOD_mouseUp131] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, Integer.TYPE, Integer.TYPE}));
      methods[METHOD_mouseUp131].setDisplayName ( "" );
      methods[METHOD_size132] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("size", new Class[] {}));
      methods[METHOD_size132].setDisplayName ( "" );
      methods[METHOD_inside133] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("inside", new Class[] {Integer.TYPE, Integer.TYPE}));
      methods[METHOD_inside133].setDisplayName ( "" );
      methods[METHOD_resize134] = new MethodDescriptor ( chartdemo.BarChart.class.getMethod("resize", new Class[] {java.awt.Dimension.class}));
      methods[METHOD_resize134].setDisplayName ( "" );
    }
    catch( Exception e) {}//GEN-HEADEREND:Methods

    // Here you can add code for customizing the methods array.
    
}//GEN-LAST:Methods

  private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
  private static final int defaultEventIndex = -1;//GEN-END:Idx


    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     * 
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
	return beanDescriptor;
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     * 
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
        return properties;
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     * 
     * @return  An array of EventSetDescriptors describing the kinds of 
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
        return eventSets;
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     * 
     * @return  An array of MethodDescriptors describing the methods 
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
        return methods;
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are 
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean. 
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }
}

