/**
 * 祖先グリッド定義
 */

let Tb1SosenGridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1SosenGrid.sosenId'], 80, 'primaryKey numbering', null),
    Column.text('SOSEN_MEI', Messages['Tb1SosenGrid.sosenMei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1SosenGrid.deleteF'], 30, ''),
];
