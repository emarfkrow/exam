/**
 * 祖先グリッド定義
 */

let Tb1SosenGridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1SosenGrid.sosenId'], 80, 'primaryKey numbering', null),
    Column.text('SOSEN_MEI', Messages['Tb1SosenGrid.sosenMei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Tb1SosenGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1SosenGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1SosenGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1SosenGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1SosenGrid.deleteF'], 30, ''),
];
