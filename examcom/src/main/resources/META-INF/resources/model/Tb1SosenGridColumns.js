/**
 * 祖先グリッド定義
 */

let Tb1SosenGridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1SosenGrid.sosenId'], 80, 'primaryKey numbering', null),
    Column.text('BIKO', Messages['Tb1SosenGrid.biko'], 300, '', null),
    Column.check('DELETE_F', Messages['Tb1SosenGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1SosenGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
