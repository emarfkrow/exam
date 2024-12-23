/**
 * VIEWグリッド定義
 */

let Vb1ShisonGridColumns = [
    Column.refer('SOSEN_ID', Messages['Vb1ShisonGrid.sosenId'], 80, '', 'SOSEN_MEI'),
    Column.cell('SOSEN_MEI', Messages['Vb1ShisonGrid.sosenMei'], 300, '', null),
    Column.cell('OYA_MEI', Messages['Vb1ShisonGrid.oyaMei'], 300, '', null),
    Column.cell('ENTITY1_MEI', Messages['Vb1ShisonGrid.entity1Mei'], 300, '', null),
    Column.cell('KO_MEI', Messages['Vb1ShisonGrid.koMei'], 300, '', null),
    Column.cell('SHISON_MEI', Messages['Vb1ShisonGrid.shisonMei'], 300, '', null),
];
