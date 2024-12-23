/**
 * 親グリッド定義
 */

let Tb1OyaGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1OyaGrid.sosenId'], 80, 'primaryKey numbering', 'SOSEN_MEI'),
    Column.comma('OYA_BN', Messages['Tb1OyaGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.text('OYA_MEI', Messages['Tb1OyaGrid.oyaMei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1OyaGrid.deleteF'], 30, ''),
];
